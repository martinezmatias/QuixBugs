package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.BITCOUNT;
import com.google.gson.JsonParser;

public class BITCOUNT_TEST {
  /**
   * Junit test case for BITCOUNT generated by tests generator.
   */
  @Test(timeout = 100)
  public void bitcount_test1() {
    try {
      Object actual = BITCOUNT.bitcount((int)127);
      assertEquals("7",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test2() {
    try {
      Object actual = BITCOUNT.bitcount((int)128);
      assertEquals("1",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test3() {
    try {
      Object actual = BITCOUNT.bitcount((int)3005);
      assertEquals("9",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test4() {
    try {
      Object actual = BITCOUNT.bitcount((int)13);
      assertEquals("3",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test5() {
    try {
      Object actual = BITCOUNT.bitcount((int)14);
      assertEquals("3",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test6() {
    try {
      Object actual = BITCOUNT.bitcount((int)27);
      assertEquals("4",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test7() {
    try {
      Object actual = BITCOUNT.bitcount((int)834);
      assertEquals("4",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test8() {
    try {
      Object actual = BITCOUNT.bitcount((int)254);
      assertEquals("7",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void bitcount_test9() {
    try {
      Object actual = BITCOUNT.bitcount((int)256);
      assertEquals("1",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}
