package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.RPN_EVAL;
import com.google.gson.JsonParser;

public class RPN_EVAL_TEST {
  /**
   * Junit test case for RPN_EVAL generated by tests generator.
   */
  @Test(timeout = 100)
  public void rpn_eval_test1() {
    try {
      Object actual = RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList(3.0,5.0,"+",2.0,"/")));
      assertEquals("4.0",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void rpn_eval_test2() {
    try {
      Object actual = RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList(2.0,2.0,"+")));
      assertEquals("4.0",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void rpn_eval_test3() {
    try {
      Object actual = RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList(7.0,4.0,"+",3.0,"-")));
      assertEquals("8.0",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void rpn_eval_test4() {
    try {
      Object actual = RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList(1.0,2.0,"*",3.0,4.0,"*","+")));
      assertEquals("14.0",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void rpn_eval_test5() {
    try {
      Object actual = RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList(5.0,9.0,2.0,"*","+")));
      assertEquals("23.0",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void rpn_eval_test6() {
    try {
      Object actual = RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList(5.0,1.0,2.0,"+",4.0,"*","+",3.0,"-")));
      assertEquals("14.0",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}
