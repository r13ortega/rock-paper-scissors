import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTesty {

    @Test
    void gameLogicTest1(){
        assertEquals("Tie", Main.gameLogicReturn("rock", "rock"));
    }
    @Test
    void gameLogicTest2a(){
        assertEquals("CPU Wins", Main.gameLogicReturn("paper", "scissors"));
    }
    @Test
    void gameLogicTest2b(){
        assertEquals("CPU Wins", Main.gameLogicReturn("paper", "lizard"));
    }
    @Test
    void gameLogicTest3a(){
        assertEquals("CPU Wins", Main.gameLogicReturn("scissors", "rock"));
    }
    @Test
    void gameLogicTest3b(){
        assertEquals("CPU Wins", Main.gameLogicReturn("scissors", "spock"));
    }
    @Test
    void gameLogicTest4a(){
        assertEquals("CPU Wins", Main.gameLogicReturn("lizard", "rock"));
    }
    @Test
    void gameLogicTest4b(){
        assertEquals("CPU Wins", Main.gameLogicReturn("lizard", "scissors"));
    }
    @Test
    void gameLogicTest5a(){
        assertEquals("CPU Wins", Main.gameLogicReturn("spock", "paper"));
    }
    @Test
    void gameLogicTest5b(){
        assertEquals("CPU Wins", Main.gameLogicReturn("spock", "lizard"));
    }
    @Test
    void gameLogicTest6a(){
        assertEquals("CPU Wins", Main.gameLogicReturn("rock", "paper"));
    }
    @Test
    void gameLogicTest6b(){
        assertEquals("CPU Wins", Main.gameLogicReturn("rock", "spock"));
    }
}