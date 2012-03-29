
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Mar 06 07:39:41 PST 2012
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Mar 06 07:39:41 PST 2012
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\003\004\000\002\002\004\000\002\003" +
    "\003\000\002\005\002\000\002\004\005\000\002\006\002" +
    "\000\002\004\005\000\002\002\003\000\002\002\005\000" +
    "\002\002\005\000\002\002\005\000\002\002\005\000\002" +
    "\002\005\000\002\002\004\000\002\002\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\012\003\005\004\011\006\004\013\010\001" +
    "\002\000\010\004\011\006\004\013\010\001\002\000\004" +
    "\012\ufffc\001\002\000\014\002\032\003\005\004\011\006" +
    "\004\013\010\001\002\000\014\002\uffff\003\uffff\004\uffff" +
    "\006\uffff\013\uffff\001\002\000\010\004\011\006\004\013" +
    "\010\001\002\000\020\005\ufffa\006\ufffa\007\ufffa\010\ufffa" +
    "\011\ufffa\012\ufffa\014\ufffa\001\002\000\016\005\017\006" +
    "\013\007\020\010\014\011\015\012\ufffe\001\002\000\010" +
    "\004\011\006\004\013\010\001\002\000\010\004\011\006" +
    "\004\013\010\001\002\000\010\004\011\006\004\013\010" +
    "\001\002\000\004\012\023\001\002\000\010\004\011\006" +
    "\004\013\010\001\002\000\010\004\011\006\004\013\010" +
    "\001\002\000\020\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011" +
    "\015\012\ufff6\014\ufff6\001\002\000\020\005\ufff9\006\ufff9" +
    "\007\020\010\014\011\015\012\ufff9\014\ufff9\001\002\000" +
    "\014\002\ufffd\003\ufffd\004\ufffd\006\ufffd\013\ufffd\001\002" +
    "\000\020\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\015\012" +
    "\ufff5\014\ufff5\001\002\000\020\005\ufff7\006\ufff7\007\ufff7" +
    "\010\ufff7\011\015\012\ufff7\014\ufff7\001\002\000\020\005" +
    "\ufff8\006\ufff8\007\020\010\014\011\015\012\ufff8\014\ufff8" +
    "\001\002\000\016\005\017\006\013\007\020\010\014\011" +
    "\015\014\030\001\002\000\020\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\011\ufff3\012\ufff3\014\ufff3\001\002\000\014\002" +
    "\001\003\001\004\001\006\001\013\001\001\002\000\004" +
    "\002\000\001\002\000\004\012\034\001\002\000\014\002" +
    "\ufffb\003\ufffb\004\ufffb\006\ufffb\013\ufffb\001\002\000\020" +
    "\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011\015\012\ufff4\014" +
    "\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\010\002\011\003\005\004\006\001\001\000" +
    "\004\002\034\001\001\000\004\006\032\001\001\000\006" +
    "\002\011\004\030\001\001\000\002\001\001\000\004\002" +
    "\026\001\001\000\002\001\001\000\004\005\015\001\001" +
    "\000\004\002\025\001\001\000\004\002\024\001\001\000" +
    "\004\002\023\001\001\000\002\001\001\000\004\002\021" +
    "\001\001\000\004\002\020\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}





	public static void main(String args[]) throws Exception {
		parser analizador;
		analizador = new parser(new Scanner(System.in));
		analizador.parse();
	}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= LPARENT expresion RPARENT 
            {
              Integer RESULT =null;
		int EXWleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int EXWright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer EXW = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Integer(EXW.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= RESTA expresion 
            {
              Integer RESULT =null;
		int EPX1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int EPX1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer EPX1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Integer(EPX1 * (-1)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= expresion POTENCIA expresion 
            {
              Integer RESULT =null;
		int ED1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int ED1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer ED1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ED2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int ED2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer ED2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
			RESULT = new Integer( (int) Math.pow(ED1.intValue(),ED2.intValue()));  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= expresion DIVISION expresion 
            {
              Integer RESULT =null;
		int EC1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int EC1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer EC1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int EC2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int EC2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer EC2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
			RESULT = new Integer(EC1.intValue() / EC2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= expresion MULTIPLICACION expresion 
            {
              Integer RESULT =null;
		int EA1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int EA1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer EA1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int EA2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int EA2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer EA2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
			RESULT = new Integer(EA1.intValue() * EA2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresion ::= expresion RESTA expresion 
            {
              Integer RESULT =null;
		int EE1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int EE1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer EE1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int EE2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int EE2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer EE2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
			RESULT = new Integer(EE1.intValue() - EE2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expresion ::= expresion SUMA expresion 
            {
              Integer RESULT =null;
		int E1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int E1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer E1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int E2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int E2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer E2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
			RESULT = new Integer(E1.intValue() + E2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expresion ::= ENTERO 
            {
              Integer RESULT =null;
		int D1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int D1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer D1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
			RESULT = new Integer(D1.intValue());	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ecuacion ::= error NT$1 RESULTADO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ecuacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$1 ::= 
            {
              Object RESULT =null;
 System.out.println("Aprenda a escribir br..");  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ecuacion ::= expresion NT$0 RESULTADO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int EQleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int EQright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer EQ = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ecuacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;
		int EQleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int EQright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer EQ = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 System.out.println("Sintaxis OK"); 
							System.out.println("Resultado = "+EQ.intValue()); 
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sesion ::= ecuacion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sesion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= sesion EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // sesion ::= sesion ecuacion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sesion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

