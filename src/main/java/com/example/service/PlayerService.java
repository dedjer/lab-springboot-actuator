package com.example.service;

import com.example.model.Player;
import com.example.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService
{
    Player add(Player player);

    List get();

    Optional get(int id);

    void delete(int id);
}
