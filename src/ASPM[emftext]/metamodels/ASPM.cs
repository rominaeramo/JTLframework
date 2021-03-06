SYNTAXDEF ASPM
FOR <http://www.emftext.org/language/ASPM>
START Model

OPTIONS {
	reloadGeneratorModel = "true";
	usePredefinedTokens = "false";
}

TOKENS {
	DEFINE TEXT $('A'..'Z'|'a'..'z'|'0'..'9'|'-'|'_'|'/'|'@'|'.')+$;
	DEFINE LINEBREAK $('\r\n'|'\r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

RULES {
	
	@SuppressWarnings(featureWithoutSyntax)
	Model ::= "model" "(" ID[] "," name[] ")" "." !0 nodes* props* edges*;
	
	@SuppressWarnings(featureWithoutSyntax)
	Node ::= "node" "(" model[] "," ID[] "," "\"" IDtrace[] "\"" "," name[] ")" "." !0;
	
	@SuppressWarnings(featureWithoutSyntax)
	Prop ::= "prop" "(" model[] "," ID[] "," "\"" IDtrace[] "\"" "," "\"" owner[] "\"" "," name[] "," value[] ")" "." !0;
	
	@SuppressWarnings(featureWithoutSyntax)
	Edge ::= "edge" "(" model[] "," ID[] "," "\"" IDtrace[] "\"" "," name[] "," "\"" source[] "\"" "," "\"" target[] "\"" ")" "." !0;
	
}
