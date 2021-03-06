package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.IS_VALID_PARENTHESIZATION;
import com.google.gson.JsonParser;

public class IS_VALID_PARENTHESIZATION_TEST {
  /**
   * Junit test case for IS_VALID_PARENTHESIZATION generated by tests generator.
   */
  @Test(timeout = 100)
  public void is_valid_parenthesization_test1() {
    try {
      Object actual = IS_VALID_PARENTHESIZATION.is_valid_parenthesization((java.lang.String)"((()()))()");
      assertEquals("true",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void is_valid_parenthesization_test2() {
    try {
      Object actual = IS_VALID_PARENTHESIZATION.is_valid_parenthesization((java.lang.String)")()(");
      assertEquals("false",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void is_valid_parenthesization_test3() {
    try {
      Object actual = IS_VALID_PARENTHESIZATION.is_valid_parenthesization((java.lang.String)"((");
      assertEquals("false",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}
