package Inlamingsuppgift;

import static org.junit.Assert.assertEquals;
public class Test {

    @org.junit.Test
    public void testAddTotalCharacters(){
        Logic totalCharacters = new Logic(0,0);
        int expected = 5;
        totalCharacters.addTotalCharacters(5);
        int actual = totalCharacters.getTotalCharacters();

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testAddTotalLines(){
        Logic testIncreaseByOne = new Logic(0,0);
        int expected = 1;
        testIncreaseByOne.addTotalLines();
        int actual = testIncreaseByOne.getTotalLines();

        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void testLogic(){
        Logic testLogicValue0 = new Logic(0,0);
        int expected = 0;
        int actual = testLogicValue0.getTotalCharacters();

        assertEquals(expected, actual);

    }




}
