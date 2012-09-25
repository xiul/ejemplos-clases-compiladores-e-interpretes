import java_cup.runtime.Symbol;

%%

%cup
%notunix
%full

%%

[\r\n\t ]+    	{ /*ignoro blancos*/ }
"/" 			{ return new Symbol(sym.DIVI); }
"(" 			{ return new Symbol(sym.PARENTIZQ); }
")" 			{ return new Symbol(sym.PARENTDER); }
"^" 			{ return new Symbol(sym.POTENCIA); }
"+" 			{ return new Symbol(sym.SUMA); }
"*" 			{ return new Symbol(sym.MULTI); }
"=" 			{ return new Symbol(sym.IGUAL); }
"-" 			{ return new Symbol(sym.RESTA); }
[0-9]+		{ return new Symbol(sym.NUMERO,new Integer(yytext())); }