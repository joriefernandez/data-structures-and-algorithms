package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidationSingle() {
        assertTrue("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("()"));
        assertTrue("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("[]"));
        assertTrue("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void multiBracketValidationAllSingle() {
        assertTrue("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("(){}[]"));

    }

    @Test
    public void multiBracketValidationOneChar() {
        assertFalse("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("("));
        assertFalse("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation(")"));

    }

    @Test
    public void multiBracketValidationWithWords() {
        assertTrue("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("(abc)"));
        assertTrue("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("abc()"));
        assertTrue("Should return true for no bracket", MultiBracketValidation.multiBracketValidation("abc"));
        assertTrue("Should return true for no bracket", MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue("Should return true for no bracket", MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));

    }

    @Test
    public void multiBracketValidationImbalance() {
        assertFalse("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("[({}]"));
        assertFalse("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("(]("));
        assertFalse("Should return true for balanced bracket", MultiBracketValidation.multiBracketValidation("{(})"));
    }

    @Test (expected=IllegalArgumentException.class)
    public void multiBracketValidationNull() {
        MultiBracketValidation.multiBracketValidation(null);

    }


}