SYNTAXDEF JTLMM
FOR <http://JTLMM.ecore> 
START JTL.Transformation

//IMPORTS {
//	JTLMM.emof:<http:///emof.ecore>
//	JTLMM.essentialocl:<http:///essentialocl.ecore>
//	JTLMM.template:<http:///template.ecore>
//	JTLMM.imperativeocl:<http:///imperativeocl.ecore>	
//	JTLMM.JTL:<http:///jtl.ecore>
//}

OPTIONS {
	reloadGeneratorModel = "true";
}

TOKENS {
	DEFINE SL_COMMENT $('//'|'--')(~('\n'|'\r'|'\uffff'))* $ ;
	DEFINE ML_COMMENT $'/*'.*'*/'$ ;
//	DEFINE NOT_OPERATOR				$ 'not' $;
//	DEFINE AND_OPERATOR				$ 'and' $;
}

TOKENSTYLES {
    "SL_COMMENT" COLOR #00A000, ITALIC;
    "ML_COMMENT" COLOR #00A000, ITALIC;
}

RULES {
	@SuppressWarnings(featureWithoutSyntax)
	JTL.Transformation ::= "transformation" name[] "(" (modelParameter ("," modelParameter)*)? ")" "{"relation+ "}";
	
	@SuppressWarnings(featureWithoutSyntax)
 	JTL.Model ::= name[] ":" usedPackage[];
	
	@SuppressWarnings(featureWithoutSyntax)
 	JTL.Relation ::=  isTopLevel["top" : ""] "relation" name[] "{" variable* domain* when? where? "}";
 	
	@SuppressWarnings(featureWithoutSyntax)
 	JTL.Domain ::= isCheckable["checkonly" : ""] isEnforceable["enforce" : ""] "domain" name[] pattern;
	
	// TODO per valorizzare Domain probabilmente serve impostare EOpposite su Pattern.domain
	@SuppressWarnings(featureWithoutSyntax)
 	JTL.Pattern ::= "when" "{" (predicate ";")* "}" | 
	                "where" "{" (predicate ";")* "}" |	                     
 	                templateExpression? "{" (predicate ("," predicate)*)? "};";
	
	@SuppressWarnings(featureWithoutSyntax)
	JTL.Predicate ::= conditionExpression; //conditionExpression:OclExpression
	
	// template TemplateExp abstract;

	@SuppressWarnings(featureWithoutSyntax)
 	Template.ObjectTemplateExp ::= name[] ":" type[]? ("::" referredClass[])? ( "{" (inside ("," inside)*)? "}" )?;
	
	//Essentialocl.OclExpression ::=  "" ; abstract
	//Imperativeocl.ImperativeExpression ::= ""; abstract
	
	@SuppressWarnings(featureWithoutSyntax)
 	Imperativeocl.AssignExp ::= name[] "=" value*; // left al posto di name?
	
//	Imperativeocl.BlockExp ::= body*;
	
	// template CallExp abstract;
	// template FeaturePropertyCall abstract;
	
	@SuppressWarnings(featureWithoutSyntax)
//	Essentialocl.OperationCallExp ::= argument "and" argument;
	Essentialocl.OperationCallExp ::= name[] "(" (argument ("," argument)*)? ")" ;
	
	// template LiteralExp abstract;
	// template PrimitiveLiteralExp abstract;
	
	@SuppressWarnings(featureWithoutSyntax)
 	Essentialocl.BooleanLiteralExp ::= booleanSymbol["true" : "false"];
 	
	@SuppressWarnings(featureWithoutSyntax) 
 	Essentialocl.VariableExp ::= name[];
 	
	@SuppressWarnings(featureWithoutSyntax)
 	Essentialocl.StringLiteralExp ::= "|" name[] "|"; 
	
	@SuppressWarnings(featureWithoutSyntax)
 	Essentialocl.Variable ::= name[] (":" type[])? ";";
}