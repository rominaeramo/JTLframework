SYNTAXDEF ASPMM
FOR <http://www.emftext.org/language/ASPMM>
START Metamodel

OPTIONS {
	reloadGeneratorModel = "true";
}

RULES {

	Metamodel ::= "metamodel" "(" name[] ")" "." metanodes* metaprops* metaedges*;
	
	Metanode ::= "metanode" "(" metamodel[] "," name[] ")" "." ;
	
	Metaprop ::= "metaprop" "(" metamodel[] "," name[] "," metanode[] ")" "." ;
	
	Metaedge ::= "metaedge" "(" metamodel[] "," 
	                            type[association: "association", generalization:  "generalization", composition: "composition"] "," 
	                            name[] "," source[] "," target[] ")" "." ;

	//MetaedgeType ::=  "association" | "generalization" | "composition" ; 
	
	// syntax definition for class 'StartMetaClass'
	//StartMetaClass   ::= "myKeyword" attributeOfStartMetaClass[] aContainmentReference* ;
	
	// syntax definition for class 'AnotherMetaClass'
	//AnotherMetaClass ::= "otherKeyword" aNonContainmentReference[];
}