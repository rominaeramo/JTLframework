SYNTAXDEF ASP
FOR <http://asp.ecore>
START Transformation


IMPORTS {
	PrimitiveTypes:<ASPv3-PrimitiveTypes>
}


TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"Transformation" COLOR #7F0055, BOLD;
	"location" COLOR #7F0055, BOLD;
	"commentsBefore" COLOR #7F0055, BOLD;
	"commentsAfter" COLOR #7F0055, BOLD;
	"metamodels" COLOR #7F0055, BOLD;
	"usedLiterals" COLOR #7F0055, BOLD;
	"constraints" COLOR #7F0055, BOLD;
	"elements" COLOR #7F0055, BOLD;
	"relations" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"LeftPattern" COLOR #7F0055, BOLD;
	"element" COLOR #7F0055, BOLD;
	"relationId" COLOR #7F0055, BOLD;
	"RightPattern" COLOR #7F0055, BOLD;
	"Constraint" COLOR #7F0055, BOLD;
	"contents" COLOR #7F0055, BOLD;
	"Not" COLOR #7F0055, BOLD;
	"Eq" COLOR #7F0055, BOLD;
	"parameterName" COLOR #7F0055, BOLD;
	"right1" COLOR #7F0055, BOLD;
	"left1" COLOR #7F0055, BOLD;
	"EqSimple" COLOR #7F0055, BOLD;
	"NotEq" COLOR #7F0055, BOLD;
	"Literal" COLOR #7F0055, BOLD;
	"Node" COLOR #7F0055, BOLD;
	"metamodel" COLOR #7F0055, BOLD;
	"metaClass" COLOR #7F0055, BOLD;
	"nodeId" COLOR #7F0055, BOLD;
	"Prop" COLOR #7F0055, BOLD;
	"propId" COLOR #7F0055, BOLD;
	"metaClassId" COLOR #7F0055, BOLD;
	"propValue" COLOR #7F0055, BOLD;
	"Edge" COLOR #7F0055, BOLD;
	"edgeId" COLOR #7F0055, BOLD;
	"sourceMCId" COLOR #7F0055, BOLD;
	"targetMCId" COLOR #7F0055, BOLD;
	"Relation" COLOR #7F0055, BOLD;
	"lpattern" COLOR #7F0055, BOLD;
	"rpattern" COLOR #7F0055, BOLD;
	"type" COLOR #7F0055, BOLD;
	"Terminal" COLOR #7F0055, BOLD;
	"content" COLOR #7F0055, BOLD;
	"Metamodel" COLOR #7F0055, BOLD;
	"Metanode" COLOR #7F0055, BOLD;
	"Metaprop" COLOR #7F0055, BOLD;
	"Metaedge" COLOR #7F0055, BOLD;
	"sourceMetaClass" COLOR #7F0055, BOLD;
	"targetMetaClass" COLOR #7F0055, BOLD;
}


RULES {
	Transformation ::= "Transformation" "{" ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("metamodels" ":" metamodels) ("usedLiterals" ":" usedLiterals)* ("constraints" ":" constraints)* ("elements" ":" elements)+ ("relations" ":" relations)+ ("name" ":" name['"','"'])* "}";
	LeftPattern ::= "LeftPattern" "{" ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("element" ":" element) ("name" ":" name['"','"']) ("relationId" ":" relationId['"','"']) (isMetanode["isMetanode" : ""]) (isMetaprop["isMetaprop" : ""]) (isMetaedge["isMetaedge" : ""]) "}";
	RightPattern ::= "RightPattern" "{" ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("element" ":" element) ("name" ":" name['"','"']) ("relationId" ":" relationId['"','"']) (isMetanode["isMetanode" : ""]) (isMetaprop["isMetaprop" : ""]) (isMetaedge["isMetaedge" : ""]) "}";
	Constraint ::= "Constraint" "{" ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("contents" ":" contents)+ ("name" ":" name['"','"'])? "}";
	Not ::= "Not" "{" ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("element" ":" element)"}";
	Eq ::= "Eq" "{" ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("parameterName" ":" parameterName['"','"']) ("right1" ":" right1[]) ("left1" ":" left1[]) "}";
	EqSimple ::= "EqSimple" "{" ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])*("name" ":" name['"','"'])? ("parameterName" ":" parameterName['"','"']) ("right1" ":" right1[]) ("left1" ":" left1[]) "}";
	NotEq ::= "NotEq" "{"  ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])*("name" ":" name['"','"'])? ("parameterName" ":" parameterName['"','"']) ("right1" ":" right1[]) ("left1" ":" left1[]) "}";
	Literal ::= "Literal" "{" (isDefinition["isDefinition" : ""]) ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("parameterName" ":" parameterName['"','"']) "}";
	Node ::= "Node" "{" (isNodex["isNodex" : ""]) (isTrace["isTrace" : ""]) ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("metamodel" ":" metamodel[]) ("metaClass" ":" metaClass['"','"']) ("nodeId" ":" nodeId) "}";
	Prop ::= "Prop" "{" isPropx["isPropx" : ""] isTrace["isTrace" : ""] ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("metamodel" ":" metamodel[]) ("propId" ":" propId) ("metaClassId" ":" metaClassId) ("propValue" ":" propValue) "}";
	Edge ::= "Edge" "{" isEdgex["isEdgex" : ""] isTrace["isTrace" : ""] ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("metamodel" ":" metamodel[]) ("edgeId" ":" edgeId) ("sourceMCId" ":" sourceMCId) ("targetMCId" ":" targetMCId) "}";
	Relation ::= "Relation" "{" left2right["left2right" : ""] right2left["right2left" : ""] ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("lpattern" ":" lpattern) ("rpattern" ":" rpattern) ("relationId" ":" relationId['"','"']) ("name" ":" name['"','"']) ("type" ":" type['"','"'])? "}";
	Terminal ::= "Terminal" "{"  ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("content" ":" content) "}";
	Metamodel ::= "Metamodel" "{"  ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? "}";
	Metanode ::= "Metanode" "{"  ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("metamodel" ":" metamodel[]) "}";
	Metaprop ::= "Metaprop" "{"  ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("metamodel" ":" metamodel[]) ("metaClass" ":" metaClass['"','"']) "}";
	Metaedge ::= "Metaedge" "{"  ("location" ":" location['"','"'])? ("commentsBefore" ":" commentsBefore[])* ("commentsAfter" ":" commentsAfter[])* ("name" ":" name['"','"'])? ("metamodel" ":" metamodel[]) ("sourceMetaClass" ":" sourceMetaClass['"','"']) ("targetMetaClass" ":" targetMetaClass['"','"']) "}";
}