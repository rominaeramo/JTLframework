SYNTAXDEF ASPM
FOR <http://www.emftext.org/language/ASPM>
START Model

OPTIONS {
	reloadGeneratorModel = "true";
}

RULES {
	
	Model ::= "model" "(" ID[] "," model[] ")" "." nodes* props* edges*;
	
	Node ::= "node" "(" model[] "," ID[] "," IDtrace[] "," node[] ")" "." ;
	
	Prop ::= "prop" "(" model[] "," ID[] "," IDtrace[] "," prop[] "," value[] "," owner[] ")" "." ;
	
	Edge ::= "edge" "(" model[] "," ID[] "," IDtrace[] "," edge[] "," source[] "," target[] ")" "." ;
	
}