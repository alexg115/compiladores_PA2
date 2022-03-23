/* The following code was generated by JFlex 1.6.1 */

/*
 * CS164: Spring 2004
 * Programming Assignment 2
 *
 * The scanner definition for Cool.
 *
 */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>cool.lex</tt>
 */
class CoolLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int LINE_COMMENT = 2;
  public static final int BLOCK_COMMENT = 4;
  public static final int STRING = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\77\1\5\1\6\1\12\1\11\1\11\22\0\1\5\1\0"+
    "\1\76\5\0\1\14\1\16\1\15\1\63\1\67\1\10\1\65\1\64"+
    "\2\75\10\1\1\71\1\70\1\62\1\60\1\61\1\0\1\72\1\22"+
    "\1\3\1\20\1\51\1\26\1\32\1\3\1\40\1\34\2\3\1\30"+
    "\1\3\1\36\1\47\1\53\1\3\1\7\1\24\1\43\1\57\1\45"+
    "\1\55\3\3\1\0\1\100\2\0\1\4\1\0\1\21\1\101\1\17"+
    "\1\50\1\25\1\31\1\2\1\37\1\33\2\2\1\27\1\2\1\35"+
    "\1\46\1\52\1\2\1\41\1\23\1\42\1\56\1\44\1\54\3\2"+
    "\1\74\1\5\1\73\1\66\6\0\1\13\u1fa2\0\1\13\1\13\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\5\2\6\1\7"+
    "\1\10\1\11\1\12\1\3\1\4\1\3\1\4\1\3"+
    "\1\4\1\3\1\4\1\3\1\4\1\3\1\4\1\3"+
    "\1\4\1\3\1\4\1\3\1\4\1\3\1\4\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\1\1\32"+
    "\1\33\1\34\1\35\1\36\2\3\2\4\2\3\2\4"+
    "\2\3\2\4\1\3\2\37\1\3\1\40\1\41\1\4"+
    "\1\40\1\41\2\3\2\4\2\3\1\4\2\42\1\3"+
    "\1\4\1\3\1\4\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\2\3\2\4\2\3"+
    "\2\4\1\55\1\3\1\55\1\4\3\3\2\4\1\56"+
    "\1\57\1\56\1\57\2\3\1\4\1\3\1\4\1\3"+
    "\1\4\1\60\1\3\1\60\1\4\1\61\1\62\1\61"+
    "\1\62\2\63\3\3\2\4\1\64\2\65\2\66\1\3"+
    "\1\4\2\67\1\70\2\3\2\4\2\71\1\72\1\3"+
    "\1\72\1\4\1\3\1\4\2\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\102\0\204\0\306\0\u0108\0\u014a\0\u018c\0\u01ce"+
    "\0\u0210\0\u0108\0\u01ce\0\u0252\0\u0294\0\u0108\0\u0108\0\u02d6"+
    "\0\u0318\0\u035a\0\u039c\0\u03de\0\u0420\0\u0462\0\u04a4\0\u04e6"+
    "\0\u0528\0\u056a\0\u05ac\0\u05ee\0\u0630\0\u0672\0\u06b4\0\u06f6"+
    "\0\u0738\0\u077a\0\u07bc\0\u07fe\0\u0840\0\u0108\0\u0108\0\u0108"+
    "\0\u0108\0\u0108\0\u0108\0\u0108\0\u0108\0\u0108\0\u0108\0\u0108"+
    "\0\u0108\0\u0108\0\u0882\0\u08c4\0\u0108\0\u0906\0\u0948\0\u0108"+
    "\0\u098a\0\u09cc\0\u0a0e\0\u0a50\0\u0a92\0\u0ad4\0\u0b16\0\u0b58"+
    "\0\u0b9a\0\u0bdc\0\u0c1e\0\u0c60\0\u0ca2\0\u018c\0\u01ce\0\u0ce4"+
    "\0\u018c\0\u0d26\0\u0d68\0\u01ce\0\u0daa\0\u0dec\0\u0e2e\0\u0e70"+
    "\0\u0eb2\0\u0ef4\0\u0f36\0\u0f78\0\u018c\0\u01ce\0\u0fba\0\u0ffc"+
    "\0\u103e\0\u1080\0\u0108\0\u0108\0\u0108\0\u0108\0\u0108\0\u0108"+
    "\0\u0108\0\u0108\0\u0108\0\u0108\0\u10c2\0\u1104\0\u1146\0\u1188"+
    "\0\u11ca\0\u120c\0\u124e\0\u1290\0\u018c\0\u12d2\0\u01ce\0\u1314"+
    "\0\u1356\0\u1398\0\u13da\0\u141c\0\u145e\0\u018c\0\u018c\0\u01ce"+
    "\0\u01ce\0\u14a0\0\u14e2\0\u1524\0\u1566\0\u15a8\0\u15ea\0\u162c"+
    "\0\u018c\0\u166e\0\u01ce\0\u16b0\0\u018c\0\u018c\0\u01ce\0\u01ce"+
    "\0\u018c\0\u01ce\0\u16f2\0\u1734\0\u1776\0\u17b8\0\u17fa\0\u018c"+
    "\0\u018c\0\u01ce\0\u018c\0\u01ce\0\u183c\0\u187e\0\u018c\0\u01ce"+
    "\0\u018c\0\u18c0\0\u1902\0\u1944\0\u1986\0\u018c\0\u01ce\0\u018c"+
    "\0\u19c8\0\u01ce\0\u1a0a\0\u1a4c\0\u1a8e\0\u018c\0\u01ce";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\1\10\1\5\1\11\1\12\1\13"+
    "\1\14\2\11\1\0\1\15\1\16\1\17\1\20\1\21"+
    "\1\7\1\10\1\7\1\10\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\7\1\10"+
    "\1\7\1\34\1\35\1\7\1\10\1\36\1\37\1\7"+
    "\1\10\1\40\1\41\1\42\1\43\1\7\1\10\1\44"+
    "\1\5\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\6\1\60\2\5\1\7"+
    "\6\5\1\0\2\5\3\0\66\5\6\61\1\62\6\61"+
    "\1\63\1\5\63\61\6\64\1\0\2\64\1\0\64\64"+
    "\1\65\1\5\1\66\1\64\103\0\1\6\73\0\1\6"+
    "\6\0\3\7\2\0\1\7\7\0\41\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\10\2\0\1\10\7\0\41\10"+
    "\15\0\1\10\3\0\1\10\5\0\1\11\3\0\2\11"+
    "\77\0\1\67\106\0\1\70\66\0\3\7\2\0\1\7"+
    "\7\0\2\7\2\71\4\7\2\72\27\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\10\2\0\1\10\7\0\2\10"+
    "\2\73\4\10\2\74\27\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\7\2\0\1\7\7\0\4\7\2\75\2\7"+
    "\2\76\27\7\15\0\1\7\3\0\1\7\2\0\3\10"+
    "\2\0\1\10\7\0\4\10\2\77\2\10\2\100\27\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\7\2\0\1\7"+
    "\7\0\6\7\2\101\17\7\2\102\10\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\10\2\0\1\10\7\0\6\10"+
    "\2\103\17\10\2\104\10\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\7\2\0\1\7\7\0\2\7\2\105\10\7"+
    "\2\106\23\7\15\0\1\7\3\0\1\7\2\0\3\10"+
    "\2\0\1\10\7\0\14\10\2\107\23\10\15\0\1\10"+
    "\3\0\1\10\2\0\3\7\2\0\1\7\7\0\4\7"+
    "\2\110\4\7\2\111\2\7\2\112\21\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\10\2\0\1\10\7\0\4\10"+
    "\2\113\4\10\2\114\2\10\2\115\21\10\15\0\1\10"+
    "\3\0\1\10\2\0\3\7\2\0\1\7\7\0\6\7"+
    "\2\116\17\7\2\117\10\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\6\10\2\120\17\10"+
    "\2\121\10\10\15\0\1\10\3\0\1\10\2\0\3\7"+
    "\2\0\1\122\7\0\20\7\2\123\1\122\16\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\10\2\0\1\10\7\0"+
    "\20\10\2\124\17\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\7\2\0\1\7\7\0\12\7\2\125\25\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\10\2\0\1\10\7\0"+
    "\12\10\2\126\25\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\7\2\0\1\7\7\0\27\7\2\127\10\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\10\2\0\1\10\7\0"+
    "\27\10\2\130\10\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\7\2\0\1\7\7\0\20\7\2\131\17\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\10\2\0\1\10\7\0"+
    "\20\10\2\132\17\10\15\0\1\10\3\0\1\10\61\0"+
    "\1\133\30\0\1\134\107\0\1\135\63\0\6\64\1\0"+
    "\2\64\1\0\64\64\3\0\1\64\6\0\1\136\22\0"+
    "\1\137\3\0\1\140\3\0\1\141\1\142\33\0\1\143"+
    "\2\0\1\144\6\67\1\0\2\67\3\0\66\67\2\0"+
    "\3\7\2\0\1\7\7\0\4\7\2\145\33\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\7\2\0\1\7\7\0"+
    "\2\7\2\146\35\7\15\0\1\7\3\0\1\7\2\0"+
    "\3\10\2\0\1\10\7\0\4\10\2\147\33\10\15\0"+
    "\1\10\3\0\1\10\2\0\3\10\2\0\1\10\7\0"+
    "\2\10\2\150\35\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\7\2\0\1\7\7\0\2\7\2\151\35\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\7\2\0\1\7\7\0"+
    "\4\7\2\152\33\7\15\0\1\7\3\0\1\7\2\0"+
    "\3\10\2\0\1\10\7\0\2\10\2\153\35\10\15\0"+
    "\1\10\3\0\1\10\2\0\3\10\2\0\1\10\7\0"+
    "\4\10\2\154\33\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\7\2\0\1\7\7\0\23\7\2\155\14\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\7\2\0\1\7\7\0"+
    "\27\7\2\156\10\7\15\0\1\7\3\0\1\7\2\0"+
    "\3\10\2\0\1\10\7\0\23\10\2\157\14\10\15\0"+
    "\1\10\3\0\1\10\2\0\3\10\2\0\1\10\7\0"+
    "\27\10\2\160\10\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\7\2\0\1\7\7\0\10\7\2\161\27\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\7\2\0\1\7\7\0"+
    "\25\7\2\162\12\7\15\0\1\7\3\0\1\7\2\0"+
    "\3\7\2\0\1\7\7\0\20\7\2\163\17\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\10\2\0\1\10\7\0"+
    "\25\10\2\164\12\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\10\2\0\1\10\7\0\20\10\2\165\17\10\15\0"+
    "\1\10\3\0\1\10\2\0\3\7\2\0\1\7\7\0"+
    "\35\7\2\166\2\7\15\0\1\7\3\0\1\7\2\0"+
    "\3\7\2\0\1\7\7\0\23\7\2\167\14\7\15\0"+
    "\1\7\3\0\1\7\2\0\3\10\2\0\1\10\7\0"+
    "\35\10\2\170\2\10\15\0\1\10\3\0\1\10\2\0"+
    "\3\10\2\0\1\10\7\0\23\10\2\171\14\10\15\0"+
    "\1\10\3\0\1\10\2\0\3\7\2\0\1\7\7\0"+
    "\37\7\2\172\15\0\1\7\3\0\1\7\2\0\3\7"+
    "\2\0\1\7\7\0\6\7\2\173\31\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\10\2\0\1\10\7\0\6\10"+
    "\2\174\31\10\15\0\1\10\3\0\1\10\2\0\3\7"+
    "\2\0\1\7\7\0\27\7\2\175\10\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\10\2\0\1\10\7\0\27\10"+
    "\2\176\10\10\15\0\1\10\3\0\1\10\2\0\3\7"+
    "\2\0\1\7\7\0\14\7\2\177\23\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\10\2\0\1\10\7\0\14\10"+
    "\2\200\23\10\15\0\1\10\3\0\1\10\2\0\3\7"+
    "\2\0\1\7\7\0\6\7\2\201\31\7\15\0\1\7"+
    "\3\0\1\7\2\0\3\7\2\0\1\7\7\0\4\7"+
    "\2\202\33\7\15\0\1\7\3\0\1\7\2\0\3\10"+
    "\2\0\1\10\7\0\6\10\2\203\31\10\15\0\1\10"+
    "\3\0\1\10\2\0\3\10\2\0\1\10\7\0\4\10"+
    "\2\204\33\10\15\0\1\10\3\0\1\10\2\0\3\7"+
    "\2\0\1\7\7\0\2\205\37\7\15\0\1\7\3\0"+
    "\1\7\2\0\3\7\2\0\1\7\7\0\6\7\2\206"+
    "\31\7\15\0\1\7\3\0\1\7\2\0\3\10\2\0"+
    "\1\10\7\0\2\207\37\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\10\2\0\1\10\7\0\6\10\2\210\31\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\7\2\0\1\7"+
    "\7\0\33\7\2\211\4\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\33\10\2\212\4\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\7\2\0\1\7"+
    "\7\0\4\7\2\213\33\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\7\2\0\1\7\7\0\27\7\2\214\10\7"+
    "\15\0\1\7\3\0\1\7\2\0\3\7\2\0\1\7"+
    "\7\0\6\7\2\215\31\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\27\10\2\216\10\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\10\2\0\1\10"+
    "\7\0\6\10\2\217\31\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\7\2\0\1\7\7\0\6\7\2\220\31\7"+
    "\15\0\1\7\3\0\1\7\2\0\3\7\2\0\1\7"+
    "\7\0\16\7\2\221\21\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\16\10\2\222\21\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\7\2\0\1\7"+
    "\7\0\10\7\2\223\27\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\10\10\2\224\27\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\7\2\0\1\7"+
    "\7\0\10\7\2\225\27\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\10\10\2\226\27\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\7\2\0\1\7"+
    "\7\0\4\7\2\227\33\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\4\10\2\230\33\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\7\2\0\1\7"+
    "\7\0\6\7\2\231\31\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\7\2\0\1\7\7\0\14\7\2\232\23\7"+
    "\15\0\1\7\3\0\1\7\2\0\3\7\2\0\1\233"+
    "\7\0\22\7\1\233\16\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\14\10\2\234\23\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\10\2\0\1\235"+
    "\7\0\22\10\1\235\16\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\7\2\0\1\7\7\0\6\7\2\236\31\7"+
    "\15\0\1\7\3\0\1\7\2\0\3\10\2\0\1\10"+
    "\7\0\6\10\2\237\31\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\7\2\0\1\7\7\0\31\7\2\240\6\7"+
    "\15\0\1\7\3\0\1\7\2\0\3\7\2\0\1\7"+
    "\7\0\14\7\2\241\23\7\15\0\1\7\3\0\1\7"+
    "\2\0\3\10\2\0\1\10\7\0\31\10\2\242\6\10"+
    "\15\0\1\10\3\0\1\10\2\0\3\10\2\0\1\10"+
    "\7\0\14\10\2\243\23\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\7\2\0\1\7\7\0\23\7\2\244\14\7"+
    "\15\0\1\7\3\0\1\7\2\0\3\10\2\0\1\10"+
    "\7\0\23\10\2\245\14\10\15\0\1\10\3\0\1\10"+
    "\2\0\3\7\2\0\1\7\7\0\4\7\2\246\33\7"+
    "\15\0\1\7\3\0\1\7\2\0\3\10\2\0\1\10"+
    "\7\0\4\10\2\247\33\10\15\0\1\10\3\0\1\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6864];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\4\1\1\11\3\1\2\11\26\1\15\11"+
    "\2\1\1\11\2\1\1\11\42\1\12\11\103\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    // Max size of string constants
    static int MAX_STR_CONST = 1024;

    // For assembling string constants
    StringBuffer string_buf = new StringBuffer();

    // For line numbers
    public int curr_lineno = 1;

    int get_curr_lineno() {
	  return curr_lineno;
    }

    private AbstractSymbol filename;

    void set_filename(String fname) {
	filename = AbstractTable.stringtable.addString(fname);
    }

    AbstractSymbol curr_filename() {
	return filename;
    }

    /*
     * Add extra field and methods here.
     */
	 
	 
	 boolean aux = false ;



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CoolLexer(java.io.Reader in) {
      // empty for now
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 212) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {    if (aux) {
     return new Symbol(TokenConstants.EOF);
     } 
    switch(yystate()) {
    case YYINITIAL:
	/* nothing special to do in the initial state */
	break;

/* If necessary, add code for other states here, e.g:
    case LINE_COMMENT:
	   ...
	   break;
 */
   case BLOCK_COMMENT: 
	aux = true;
	return new Symbol(TokenConstants.ERROR, "EOF in comment");
    }
    return new Symbol(TokenConstants.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /*
                    *  This should be the very last rule and will match
                    *  everything not matched by other lexical rules.
                    */
		   return new Symbol(TokenConstants.ERROR, AbstractTable.inttable.addString(yytext()));
            }
          case 60: break;
          case 2: 
            { /* Integers */
                          return new Symbol(TokenConstants.INT_CONST,
					    AbstractTable.inttable.addString(yytext()));
            }
          case 61: break;
          case 3: 
            { /* Identificadores de objeto */
                                    return new Symbol(TokenConstants.OBJECTID,
					                            AbstractTable.inttable.addString(yytext()));
            }
          case 62: break;
          case 4: 
            { /* Identificadores de tipo*/ 
                                      return new Symbol(TokenConstants.TYPEID,
					                            AbstractTable.inttable.addString(yytext()));
            }
          case 63: break;
          case 5: 
            { /*whitespace*/
            }
          case 64: break;
          case 6: 
            { /*salto de linea*/ curr_lineno++;
            }
          case 65: break;
          case 7: 
            { return new Symbol(TokenConstants.MINUS);
            }
          case 66: break;
          case 8: 
            { return new Symbol(TokenConstants.LPAREN);
            }
          case 67: break;
          case 9: 
            { return new Symbol(TokenConstants.MULT);
            }
          case 68: break;
          case 10: 
            { return new Symbol(TokenConstants.RPAREN);
            }
          case 69: break;
          case 11: 
            { return new Symbol(TokenConstants.EQ);
            }
          case 70: break;
          case 12: 
            { return new Symbol(TokenConstants.LT);
            }
          case 71: break;
          case 13: 
            { return new Symbol(TokenConstants.PLUS);
            }
          case 72: break;
          case 14: 
            { return new Symbol(TokenConstants.DIV);
            }
          case 73: break;
          case 15: 
            { return new Symbol(TokenConstants.DOT);
            }
          case 74: break;
          case 16: 
            { return new Symbol(TokenConstants.NEG);
            }
          case 75: break;
          case 17: 
            { return new Symbol(TokenConstants.COMMA);
            }
          case 76: break;
          case 18: 
            { return new Symbol(TokenConstants.SEMI);
            }
          case 77: break;
          case 19: 
            { return new Symbol(TokenConstants.COLON);
            }
          case 78: break;
          case 20: 
            { return new Symbol(TokenConstants.AT);
            }
          case 79: break;
          case 21: 
            { return new Symbol(TokenConstants.RBRACE);
            }
          case 80: break;
          case 22: 
            { return new Symbol(TokenConstants.LBRACE);
            }
          case 81: break;
          case 23: 
            { string_buf.setLength(0); yybegin(STRING);
            }
          case 82: break;
          case 24: 
            { 
            }
          case 83: break;
          case 25: 
            { curr_lineno++;
            }
          case 84: break;
          case 26: 
            { string_buf.append( yytext() );
            }
          case 85: break;
          case 27: 
            { yybegin(YYINITIAL); return new Symbol(TokenConstants.STR_CONST, AbstractTable.inttable.addString( string_buf.toString() ) );
            }
          case 86: break;
          case 28: 
            { string_buf.append("\\");
            }
          case 87: break;
          case 29: 
            { /* Comentario de linea */
            }
          case 88: break;
          case 30: 
            { yybegin(BLOCK_COMMENT);
            }
          case 89: break;
          case 31: 
            { return new Symbol(TokenConstants.FI);
            }
          case 90: break;
          case 32: 
            { return new Symbol(TokenConstants.IF);
            }
          case 91: break;
          case 33: 
            { return new Symbol(TokenConstants.IN);
            }
          case 92: break;
          case 34: 
            { return new Symbol(TokenConstants.OF);
            }
          case 93: break;
          case 35: 
            { return new Symbol(TokenConstants.DARROW);
            }
          case 94: break;
          case 36: 
            { return new Symbol(TokenConstants.ASSIGN);
            }
          case 95: break;
          case 37: 
            { yybegin(YYINITIAL);
            }
          case 96: break;
          case 38: 
            { string_buf.append("\n"); curr_lineno++;
            }
          case 97: break;
          case 39: 
            { string_buf.append("\f");
            }
          case 98: break;
          case 40: 
            { string_buf.append("\n");
            }
          case 99: break;
          case 41: 
            { string_buf.append("\r");
            }
          case 100: break;
          case 42: 
            { string_buf.append("\t");
            }
          case 101: break;
          case 43: 
            { string_buf.append("\"");
            }
          case 102: break;
          case 44: 
            { string_buf.append("\b");
            }
          case 103: break;
          case 45: 
            { return new Symbol(TokenConstants.LET);
            }
          case 104: break;
          case 46: 
            { return new Symbol(TokenConstants.NEW);
            }
          case 105: break;
          case 47: 
            { return new Symbol(TokenConstants.NOT);
            }
          case 106: break;
          case 48: 
            { return new Symbol(TokenConstants.CASE);
            }
          case 107: break;
          case 49: 
            { return new Symbol(TokenConstants.ESAC);
            }
          case 108: break;
          case 50: 
            { return new Symbol(TokenConstants.ELSE);
            }
          case 109: break;
          case 51: 
            { return new Symbol(TokenConstants.LOOP);
            }
          case 110: break;
          case 52: 
            { return new Symbol(TokenConstants.BOOL_CONST, Boolean.TRUE);
            }
          case 111: break;
          case 53: 
            { return new Symbol(TokenConstants.THEN);
            }
          case 112: break;
          case 54: 
            { return new Symbol(TokenConstants.POOL);
            }
          case 113: break;
          case 55: 
            { return new Symbol(TokenConstants.CLASS);
            }
          case 114: break;
          case 56: 
            { return new Symbol(TokenConstants.BOOL_CONST, Boolean.FALSE);
            }
          case 115: break;
          case 57: 
            { return new Symbol(TokenConstants.WHILE);
            }
          case 116: break;
          case 58: 
            { return new Symbol(TokenConstants.ISVOID);
            }
          case 117: break;
          case 59: 
            { return new Symbol(TokenConstants.INHERITS);
            }
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
