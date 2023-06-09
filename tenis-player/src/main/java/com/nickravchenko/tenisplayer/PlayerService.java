package com.nickravchenko.tenisplayer;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import jakarta.transaction.Transactional;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository repo;

    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    public Player getPlayer(int id) {

        Optional<Player> tempPlayer = repo.findById(id);

        Player p = null;

        // if the Optional has a value, assign it to p
        if (tempPlayer.isPresent())
            p = tempPlayer.get();

        // if value is not found, throw a runtime exception
        else
            throw new RuntimeException("Player with id " + id + " not found.");

        return p;
    }

    // Add a player
    public Player addPlayer(Player p) {
        return repo.save(p);
    }

    // Update a player
    public Player updatePlayer(int id, Player p) {

        // get player object by ID
        Player player = repo.getReferenceById(id);

        // update player details
        player.setName(p.getName());
        player.setNationality(p.getNationality());
        player.setBirthDate(p.getBirthDate());
        player.setTitles(p.getTitles());

        // save updates
        return repo.save(player);
    }

    // Partial update
    public Player patch(int id, Map<String, Object> playerPatch) {

        Optional<Player> player = repo.findById(id);

        if (player.isPresent()) {
            playerPatch.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(Player.class, key);
                ReflectionUtils.makeAccessible(field);
                ReflectionUtils.setField(field, player.get(), value);
            });
        }
        return repo.save(player.get());
    }

    // update a single field
    @Transactional
    public void updateTitles(int id, int titles) {
        Optional<Player> tempPlayer = repo.findById(id);

        if (tempPlayer.isEmpty())
            throw new RuntimeException("Player with id {" + id + "} not found");

        repo.updateTitles(id, titles);

    }

    // delete a player
    public void deletePlayer(int id) {
        Optional<Player> tempPlayer = repo.findById(id);

        if (tempPlayer.isEmpty())
            throw new RuntimeException("Player with id {" + id + "} not found");

        repo.delete(tempPlayer.get());
    }
}
