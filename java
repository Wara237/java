1- Variabe and data type

  in java , there are 8 primitive datatype. ti declare a variable, you need to specify the type of the data and the name of the variable.
    Exple: int age=10 // here the data type is int which is Integer data type and the variable name is "age", the value is "10"
    -Some data type are : Double,Float,String,Char,Long,Boolean,Short,byte.
    Constant Variable: To declare a constant variable, you use thr key word final. Exple: final string name="Bianca".

  Since java 10, it is now possible to declare a variable without the type. We use the "var" key word: exple: var age=10, aafter the compilation , the compiler will associate to age the type int.

2-Function

  To declare a function in java, you should have the scope, the data type, the parameter if applicable and the caracteristic.
     Exple:  public static int addition( final int a,final int b){return a+b;}
               |     |      |     |                 |                 |        
              scope  cart   type  name               parameters        key word to return the result

    To call a function, you do ClassName.functionName . the class NAME is the class where the function is created.

  3- Control
          a) if statement: if(){...} else{}
          b) Switch case: when the switch case have a numtiple statement, we uses the key word "yield" to retur it's result : 
                  exple:  var resultat = switch (film) {
                           case “Star Wars” -> “Science fiction”;
                            case “Blanche neige”, “La petite sirène” -> “Disney”;
                            case “Indiana Jones” -> {
                            String categorie = “Aventure”;
                              yield categorie;
                            }
                         default -> “Inconnu”;
                               };
                         return resultat;
                         }
          c) while: while(condition){......}
          d)do while: it is use to execute one statement at leat once before checking the condition: exple: do{........}while(condition);

      List: is a type of data type which is define with the data type and will contain a list of element: exple : List<Integer> language = Arrays.asList(1,6,5,7,0);. it come from 
         the package java.util.List
        e) for: exple: for(){}   // List<Integer> nombres= Arrays.asList(10,20,15,0,0,0,7);
		                                   int cpt=0;
		                                  for(int num:nombres) {
		                                    	if(num==0) {
			                                    	cpt=cpt+1;
		                                        	}
                                            }
