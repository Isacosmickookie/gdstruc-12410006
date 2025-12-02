import java.util.Objects;


public class Player {
    private int playerId;
    private String username;
    private int level;


    public Player(int id, String name, int level) {
        this.playerId = id;
        this.username = name;
        this.level = level;
    }
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int id) {
        this.playerId = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String toString() {
        return "Player{" +
                "id="  + playerId +
                ", name=" + username + '\'' +
                ", level=" + level +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId &&
                level == player.level &&
                Objects.equals(username, player.username);
    }


    @Override
    public int hashCode() {
        return Objects.hash(playerId, username, level);
    }
}

