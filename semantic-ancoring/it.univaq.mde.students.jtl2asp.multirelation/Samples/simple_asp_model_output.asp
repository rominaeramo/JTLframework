---------------------
- Legenda:
- *** OK
- !!! Missing
---------------------
---------------------
- METAMODEL UML
---------------------
metanode(UML,Class) ***
  metaprop(UML,name,Class) ***
  metaprop(UML,is_persisitent,Class) ***

metanode(UML,Attribute) ***
  --------------------------------------------metaprop(UML,name,Attribute) !!!
  --------------------------------------------metaprop(UML,is_primary,Attribute)

metaedge(UML,assoc,attrs,Class,Attribute) ***

---------------------
- METAMODEL RDBMS
---------------------
metanode(RDMBMS,Table) ***
  --------------------------------------------metaprop(RDMBMS,name,Table) ***
  --------------------------------------------metaprop(RDMBMS,isLocal,Table)

metanode(RDBMS,Column) ***
  --------------------------------------------metaprop(RDBMS,name,Column) !!!
  --------------------------------------------metaprop(RDBMS,dataType,Column)

metaedge(RDBMS,assoc,col,Table,Column) ***
metaedge(RDBMS,assoc,pkey,Table,Column) ***

--------------------
- MODEL UML
---------------------
node(UML,"cl1",Class) ***
  prop(UML,[cl1.1],[cl1],name,[var]) ***
  prop(UML,[cl1.2],[cl1],is_persistent,[var]) ***
  
node(UML,[at1],attribute) ***
  -------------------------------------------- prop(UML,[at1.1],[at1],name,[var]) !!!
---------------------------------------------- prop(UML,[at1.2],[at1],is_primary,[true])
  
edge(UML,[ats1],attrs,[at1],[cl1]) !!! Target wrong

----------------------------------------------node(UML,"int",primitiveDataType).
----------------------------------------------prop(UML,[int.1],[int],name,"int")
  
----------------------------------------------edge(UML,[ty1],type,[at1],[int])

---------------------
- MODEL RDBMS
---------------------
node(RDBMS,[cl1],Table) ***
  prop(RDBMS,[cl1.1],[cl1],name,[order]) ***

node(RDBMS,[at1],column) ***
  -----------------------------------------------prop(RDBMS,[at1.1],[at1],name,[order_no]) !!!
  -----------------------------------------------prop(RDBMS,[at1.2],[at1],dataType,[int])
  
edge(RDBMS,[ats1],col,[at1],[cl1]) !!! target wrong

edge(RDBMS,[ats1],pkey,[at1],[cl1]) !!! target wrong
  
