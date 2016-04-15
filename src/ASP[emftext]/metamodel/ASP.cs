@SuppressWarnings(noRuleForMetaClass)
SYNTAXDEF ASP
FOR <http://asp.ecore>
START Transformation

OPTIONS {
//	disableTokenSorting = "true";
	usePredefinedTokens = "false";
//	useClassicPrinter = "true";
//	tokenspace = "0";
}

TOKENS {
	DEFINE COMMENT $'%'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE TEXT $('A'..'Z'|'a'..'z'|'0'..'9'|'-'|'_'|'!'|':')+$;
	DEFINE LINEBREAK $('\r\n'|'\r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

RULES {
	@SuppressWarnings(featureWithoutSyntax)
	Transformation ::= elements+ !0 relations+ !0 constraints*;
	
	@SuppressWarnings(featureWithoutSyntax)
	Relation ::= patterns !0 patterns : RightPattern;
//	Relation ::= patterns (!0 patterns)+;
	
	@SuppressWarnings(featureWithoutSyntax,explicitSyntaxChoice)
//	LeftPattern  ::= ("relation_node" | "relation_prop" | "relation_edge") element['(',')'] ".";
	LeftPattern  ::= type[node : "relation_node", prop : "relation_prop", edge : "relation_edge"] element['(',')'] ".";
	@SuppressWarnings(featureWithoutSyntax,explicitSyntaxChoice)
//	RightPattern ::= ("relation_node" | "relation_prop" | "relation_edge") element['(',')'] ".";
	RightPattern ::= type[node : "relation_node", prop : "relation_prop", edge : "relation_edge"] element['(',')'] ".";
	
	@SuppressWarnings(featureWithoutSyntax,minOccurenceMismatch)
	Metanode ::= "metanode(" literals[] "," #1 literals[] ")." !0;
	@SuppressWarnings(featureWithoutSyntax,minOccurenceMismatch)
	Metaprop ::= "metaprop(" literals[] "," #1 literals[] "," #1 literals[] ")." !0;
	@SuppressWarnings(featureWithoutSyntax,minOccurenceMismatch)
	Metaedge ::= "metaedge(" literals[] "," #1 literals[] "," #1 literals[] "," #1 literals[] ")." !0;
	
	@SuppressWarnings(featureWithoutSyntax,optionalKeyword)
	Literal ::= name[] (#0 ".")? !0;

	@SuppressWarnings(featureWithoutSyntax)
	Constraint ::= ":-" expressions ("," expressions)* "." !0;

	@SuppressWarnings(featureWithoutSyntax)
	Terminal ::= element[];

	@SuppressWarnings(featureWithoutSyntax,minOccurenceMismatch,explicitSyntaxChoice)
	Node ::= ("node(" | "nodex(") literals[] "," #1 literals[] "," #1 literals[] ")." !0;
	@SuppressWarnings(featureWithoutSyntax,minOccurenceMismatch,explicitSyntaxChoice)
	Prop ::= ("prop(" | "propx(") literals[] "," #1 literals[] "," #1 literals[] "," #1 literals[] ")." !0;
	@SuppressWarnings(featureWithoutSyntax,minOccurenceMismatch,explicitSyntaxChoice)
	Edge ::= ("edge(" | "edgex(") literals[] "," #1 literals[] "," #1 literals[] "," #1 literals[] "," #1 literals[] ")." !0;

	@SuppressWarnings(featureWithoutSyntax)
	Not ::= "not" element[];
	
	@SuppressWarnings(featureWithoutSyntax)
	Eq ::= left[] "==" right[];

	@SuppressWarnings(featureWithoutSyntax)
	NotEq ::= left[] "!=" right[];

//	And ::= "And" "{" ("name" ":" name['"','"'] | "transformation" ":" transformation[] | "right" ":" right | "left" ":" left)* "}";
//	@SuppressWarnings(featureWithoutSyntax)
//	And ::= left "and" right;
}