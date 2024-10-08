/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.domain;

/**
 *
 * @author Kerolos Raouf
 */
public class Player {
    
    protected String username, password;
    protected int score;
    protected boolean isPlaying, isActive;
    
    public Player(){}
    
    public static Player fromPlayerMessageBody(PlayerMessageBody pl){
        Player player = new Player(pl.getUsername(), pl.getPassword() , pl.getScore(), pl.isIsPlaying(), pl.isIsActive());
        return player;
    }

    public Player(String username, String password, int score, boolean isPlaying, boolean isActive) {
        this.username = username;
        this.password = password;
        this.score = score;
        this.isPlaying = isPlaying;
        this.isActive = isActive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
    
}
