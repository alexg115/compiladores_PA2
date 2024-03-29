/*
 * CS164: Spring 2004
 * Programming Assignment 2
 *
 * The scanner definition for Cool.
 *
 */

import java_cup.runtime.Symbol;

%%

/* Code enclosed in %{ %} is copied verbatim to the lexer class definition.
 * All extra variables/methods you want to use in the lexer actions go
 * here.  Don't remove anything that was here initially.  */
%{
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

%}


/*  Code enclosed in %init{ %init} is copied verbatim to the lexer
 *  class constructor, all the extra initialization you want to do should
 *  go here. */
%init{
    // empty for now
%init}

/*  Code enclosed in %eofval{ %eofval} specifies java code that is
 *  executed when end-of-file is reached.  If you use multiple lexical
 *  states and want to do something special if an EOF is encountered in
 *  one of those states, place your code in the switch statement.
 *  Ultimately, you should return the EOF symbol, or your lexer won't
 *  work. */
%eofval{
   if (aux) {
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
%eofval}

/* Do not modify the following two jlex directives */
%class CoolLexer
%cup


/* This defines a new start condition for line comments.
 * .
 * Hint: You might need additional start conditions. */

/*Estados para declarar casos*/
%state LINE_COMMENT
%state BLOCK_COMMENT
%state STRING

/* Define lexical rules after the %% separator.  There is some code
 * provided for you that you may wish to use, but you may change it
 * if you like.
 * .
 * Some things you must fill-in (not necessarily a complete list):
 *   + Handle (* *) comments.  These comments should be properly nested.
 *   + Some additional multiple-character operators may be needed.  One
 *     (DARROW) is provided for you.
 *   + Handle strings.  String constants adhere to C syntax and may
 *     contain escape sequences: \c is accepted for all characters c
 *     (except for \n \t \b \f) in which case the result is c.
 * .
 * The complete Cool lexical specification is given in the Cool
 * Reference Manual (CoolAid).  Please be sure to look there. */

digito=[0-9]
integer={digito}+

minuscula=[a-z]
mayuscula=[A-Z]
letras={minuscula}+|{mayuscula}+|"_"
IdentificadoresTipo={mayuscula}|{mayuscula}({letras}|{integer})+
IdentificadoresObjeto={minuscula}|{minuscula}({letras}|{integer})+

%%

//Los whitespace no regresan tokens, \u000B en el caracter \v en formato unicode
<YYINITIAL>[" "|\t|\u000B|\f|\r]+ {/*whitespace*/}


<YYINITIAL>[\n|\t\f|\r\n|\R] {/*salto de linea*/ curr_lineno++;}

<YYINITIAL>"--".* { /* Comentario de linea */ }


/*Comentario de bloque
  Se inicia definiendo como comienza un comentario de bloque, luego con el yybegin se llama al state BLOCK_COMMENT
  para declarar lo que se debe hacer en cada caso, si hay un salto de linea aumentar el numero de lineas, si hay
  cualquier cosa menos un salto de linea o un \n no hagas nada y si llega la secuencia ")*" termina
*/

<YYINITIAL>"(*"		{ yybegin(BLOCK_COMMENT); }
<BLOCK_COMMENT>\n	{ curr_lineno++; }
<BLOCK_COMMENT>[^\n*)]	{ }
<BLOCK_COMMENT>"*"")"	{ yybegin(YYINITIAL); }


<YYINITIAL>[Cc][Aa][Ss][Ee]	{ return new Symbol(TokenConstants.CASE); }
<YYINITIAL>[Cc][Ll][Aa][Ss][Ss] { return new Symbol(TokenConstants.CLASS); }
<YYINITIAL>[Ee][Ll][Ss][Ee]  	{ return new Symbol(TokenConstants.ELSE); }
<YYINITIAL>[Ee][Ss][Aa][Cc]	{ return new Symbol(TokenConstants.ESAC); }
<YYINITIAL>f[Aa][Ll][Ss][Ee]	{ return new Symbol(TokenConstants.BOOL_CONST, Boolean.FALSE); }
<YYINITIAL>[Ff][Ii]             { return new Symbol(TokenConstants.FI); }
<YYINITIAL>[Ii][Ff]  		{ return new Symbol(TokenConstants.IF); }
<YYINITIAL>[Ii][Nn]             { return new Symbol(TokenConstants.IN); }
<YYINITIAL>[Ii][Nn][Hh][Ee][Rr][Ii][Tt][Ss] { return new Symbol(TokenConstants.INHERITS); }
<YYINITIAL>[Ii][Ss][Vv][Oo][Ii][Dd] { return new Symbol(TokenConstants.ISVOID); }
<YYINITIAL>[Ll][Ee][Tt]         { return new Symbol(TokenConstants.LET); }
<YYINITIAL>[Ll][Oo][Oo][Pp]  	{ return new Symbol(TokenConstants.LOOP); }
<YYINITIAL>[Nn][Ee][Ww]		{ return new Symbol(TokenConstants.NEW); }
<YYINITIAL>[Nn][Oo][Tt] 	{ return new Symbol(TokenConstants.NOT); }
<YYINITIAL>[Oo][Ff]		{ return new Symbol(TokenConstants.OF); }
<YYINITIAL>[Pp][Oo][Oo][Ll]  	{ return new Symbol(TokenConstants.POOL); }
<YYINITIAL>[Tt][Hh][Ee][Nn]   	{ return new Symbol(TokenConstants.THEN); }
<YYINITIAL>t[Rr][Uu][Ee]	{ return new Symbol(TokenConstants.BOOL_CONST, Boolean.TRUE); }
<YYINITIAL>[Ww][Hh][Ii][Ll][Ee] { return new Symbol(TokenConstants.WHILE); }

<YYINITIAL>"=>"		  { return new Symbol(TokenConstants.DARROW); }
<YYINITIAL>"<""-"		{ return new Symbol(TokenConstants.ASSIGN); }
<YYINITIAL>"+"			{ return new Symbol(TokenConstants.PLUS); }
<YYINITIAL>"/"			{ return new Symbol(TokenConstants.DIV); }
<YYINITIAL>"-"			{ return new Symbol(TokenConstants.MINUS); }
<YYINITIAL>"*"			{ return new Symbol(TokenConstants.MULT); }
<YYINITIAL>"="			{ return new Symbol(TokenConstants.EQ); }
<YYINITIAL>"<"			{ return new Symbol(TokenConstants.LT); }
<YYINITIAL>"."			{ return new Symbol(TokenConstants.DOT); }
<YYINITIAL>"~"			{ return new Symbol(TokenConstants.NEG); }
<YYINITIAL>","			{ return new Symbol(TokenConstants.COMMA); }
<YYINITIAL>";"			{ return new Symbol(TokenConstants.SEMI); }
<YYINITIAL>":"			{ return new Symbol(TokenConstants.COLON); }
<YYINITIAL>"("			{ return new Symbol(TokenConstants.LPAREN); }
<YYINITIAL>")"			{ return new Symbol(TokenConstants.RPAREN); }
<YYINITIAL>"@"			{ return new Symbol(TokenConstants.AT); }
<YYINITIAL>"}"			{ return new Symbol(TokenConstants.RBRACE); }
<YYINITIAL>"{"			{ return new Symbol(TokenConstants.LBRACE); }


/*Se declaran las expresiones para los enteros, los identificadores de tipo y de objeto*/

<YYINITIAL>[0-9][0-9]*  { /* Integers */
                          return new Symbol(TokenConstants.INT_CONST,
					    AbstractTable.inttable.addString(yytext())); }
 
<YYINITIAL>[A-Z][A-Za-z0-1"_"]* {/* Identificadores de tipo*/ 
                                      return new Symbol(TokenConstants.TYPEID,
					                            AbstractTable.inttable.addString(yytext())); }
		
<YYINITIAL>[a-z][A-Za-z0-1"_"]* {/* Identificadores de objeto */
                                    return new Symbol(TokenConstants.OBJECTID,
					                            AbstractTable.inttable.addString(yytext())); }
		

/*strings
  Parecido al comentario de bloque se empieza declarando como inicia un string , en esta caso con el caracter \", pero ahora
  ademas de hacer eso se actualiza el string.buf para indicarle que es lo que debe meter segun lo que se encuentre.
  Se llama al estado STRING para indicar los casos.
  Si se encuentra otro \" cierra la cadena y retorna el simbolo
  Si se encuentra cualquier cosa que no sean los casos especiales \n,\r\b, etc, mete el texto tal cual
  Si se encuentra \\t,\\\n, etc en lugar de escribirlo asi, escribe solo una diagonal
*/
<YYINITIAL>\"		{  string_buf.setLength(0); yybegin(STRING); }
<STRING>{
	\"		{ yybegin(YYINITIAL); return new Symbol(TokenConstants.STR_CONST, AbstractTable.inttable.addString( string_buf.toString() ) ); }
	[^\n\r\b\f\"\\]+	{ string_buf.append( yytext() );}
	\\t 		{ string_buf.append("\t"); }
	\\\n		{ string_buf.append("\n"); curr_lineno++; }
	\\n 		{ string_buf.append("\n"); }
	\\b 		{ string_buf.append("\b"); }
	\\f 		{ string_buf.append("\f"); }
	\\r 		{ string_buf.append("\r"); }
	\\\" 		{ string_buf.append("\""); }
	\\ 		{ string_buf.append("\\"); }
}
										
										

.                { /*
                    *  This should be the very last rule and will match
                    *  everything not matched by other lexical rules.
                    */
		   return new Symbol(TokenConstants.ERROR, AbstractTable.inttable.addString(yytext()));}
