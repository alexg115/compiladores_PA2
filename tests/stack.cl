(*
Alejandro Emiliano Gomero Nuñez

El programa toma de base el ejemplo de lista.cl pero con algunas modificaciones para poder implementar el PA1. Existen 2 tipos de listas: vacia y no vacia, 
con la combinacion de ambas se puede generar una estructura de pila. 

Se modifico el archivo atoi.cl para recibir un "0" o un vacio cuando haya un error al convertir un elemento en lugar de utilizar el abort().

La clase Lista son para las listas vacias, la clase Cons hereda de Lista y se utiliza para las listas no vacias. 
Los metodos de las clases vacias siempre regresan un vacio, porque aun no hay ningun elemento dentro, a excepcion de isNull() que regresa true
y de cons() que su funcion es crear un objeto de tipo Cons (lista no vacia). El metodo cons() recibe como parametro el elemento que se desea insertar en la lista y una vez creada
la nueva lista no vacia se manda a llamar a un metodo de esa clase llamado init() al que se le manda el elemento que se quiere ser insertado y la lista actual para que
regrese una nueva lista con el elemento ya insertado, pasando a ser ahora una lista no vacia.

Gracias a la herencia, la clase Cons puede tener sus propias versiones de los metodos de la clase Lista. Cuando una lista pasa de ser vacia a no vacia, su metodo isNull()
ahora regresara false puesto que para poder ser una lista no vacia previamente se tuvo que haber creado ese tipo de objeto desde el metodo de una vacia, pasando a ser una 
no vacia, lo que quiere decir que tiene por lo menos un elemento.

La clase Cons cuenta con 4 variables: 
   -cima de tipo string (para poder agregar los simbolos "+" "s", no solo numeros) que hace referencia al ultimo elemento insertado
   -cdr de tipo Lista que gracias a la herencia tambien acepta tipo Cons. En esta varible se guarda el resto de la lista. Si es tipo cons guardara otro objeto con 
   una cima (que sera el elemento anterior) y un cdr que, de nuevo, es otro objeto de tipo Cons/Lista. Esto nos permitira "enlazar" todos los elementos hasta que 
   se llegue al objeto inicial (lista vacia) que al no tener variables quiere decir que la lista ha terminado
   -temp1 y temp2 son 2 variables que se utilizan para guardar los ultimos 2 elementos de la pila, lo que sirve para poder hacer el cambio de posicion sin perderlos

El metodo head() regresa la cima, es decir, el ultimo elemento en ser insertado.

tail() regresa cdr o "el resto de la pila", un objeto que contiene un atributo que indica el elemento anterior y otro atributo de tipo Cons/Lista

pop() borra el ultimo elemento que se inserto, esto se logra asignandole al atributo cima el elemento anterior, y al atributo cdr el tail de si mismo. 
Lo primero se logra llamando a la funcion tail() y posteriormente head() del objeto mismo, y lo segundo simplemente llamando a la funcion tail() del mismo cdr. 

cambio() intercambia los ultimos 2 elementos insertados. Esto se logra con la ayuda de las viables temp1 y temp2. Primero se guarda el valor de las variables y despues
se hace el pop de la pila de cada uno, a continuacion simplemente se vuelven a insertar en el orden inverso.

init() se encarga de asignarle a los atributos cima y cdr su valor, estos valores se reciben desde el metodo cons() de la clase Lista, que vienen siendo el 
elemento a ser insertardo y un objeto de tipo Cons/Lista.

Para el funcionamineto del ciclo en el main se manejan 3 variables. "opcion" que guarda el elemento que se leyo, "elementos" donde se iran guardando los 
elementos que inserte el usuario, y "atoi" un objeto de la clase A2I para poder convertir enteros a string y viceversa.

Mientras no se lea una "x" el programa seguira dando ciclos. Iniciaria leyendo la variable opcion. Si es una "s" o un "+" se agregara a la pila. 
Para agregar numeros, primero se intenta convertirlo a un entero con atoi. Si regresa un 0 quiere decir que no fue posible la conversion, por otro lado si 
regresa un numero diferente se agrega a la pila. Con esto se evita que se ingresen simbolos no validos a la pila.

Si el programa lee una "d" se mandara a llamar a la funcion print_list() para mostrar el estado de la pila en la pantalla. 
Si el programa lee una "e" verificara el elemento mas reciente de la pila. Si es una "s" lo eliminara de la pila y llamara al metodo cambio() para intercambiar.
Si el elemento mas reciente es "+", lo eliminara de la pila y recuperara los 2 elementos mas recientes convirtiendolos a entero, se borraran con el metodo pop() y la suma de ambos se 
insertara como un nuevo elemento despues haberlo convertido nuevamente en string. 




*)
class Lista {
   -- Clase para una lista vacia, para empezar una lista se declara una variable de este tipo

   isNull() : Bool { true };

   --isNull() siempre regresa true porque al inicio es una lista vacia

   head()  : String { { ""; } };

   --regresa el elemento en la cima, en este caso vacio por no tener ningun elemento

   tail()  : Lista { {  self; } };

   pop() : Lista {{self;}};

   cambio() : Lista {{self;}};
   (*
      cons() crea un nuevo objeto de la clase cons que hereda de lista y manda como parametro el nuevo elemento y asi mismo a la funcion init() para retornar una nueva 
      pila, ahora con el nuevo elemento en la cima
   *)

   cons(i : String) : Lista {
      (new Cons).init(i, self)
   };

};

class Cons inherits Lista {

   --Clase que hereda de la clase Lista para una lista que ya tiene elementos. Un objeto de tipo lista crea un nuevo objeto de esta clase para agregar un nuevo elemento a la pila

   cima : String;	-- El elemento que esta en la cima de la pila

   cdr : Lista;	-- resto de la pila

   temp1 : String ;--variable temporal para hacer el cambio

   temp2 : String; --variable temporal para hacer el cambio

   isNull() : Bool { false };

   head()  : String { cima };

   tail()  : Lista { cdr };

   pop() : Lista {{
      (*
         Funcion para borrar el elemento en la cima, a la varible cima
         se le asigna la cima de los elementos anteriores, y los elementos
         anteriores de esa cima se asignan a los de este objeto
      *)
      cima<-cdr.head();
      cdr<-cdr.tail();
      self;
   }};

   cambio() : Lista {{
      (*
         Funcion para realizar el cambio de posicion de los primeros 2 elementos
         Se utilizan variables de soporte para guardar los valores, posteriormente 
         se borran de la pila y se agregan de nuevo en orden inverso
      *)
      temp1<-cima;
      pop();
      temp2<-cima;
      pop();
      cons(temp1).cons(temp2);
   }};

   init(i : String, rest : Lista) : Lista {
      {
	 cima <- i;
	 cdr <- rest;
	 self;
      }
   };

};

class Main inherits IO {
   
   print_list(l : Lista) : Object {
      if l.isNull() then out_string("\n")
                   else {
			   out_string(l.head());
			   out_string(" ");
			   print_list(l.tail());
		        }
      fi
   };

   elementos : Lista;
   opcion : String<-"";
   num : Int;
   num2 : Int;
   atoi : A2I;

   main() : Object {
      {
         elementos<- new Lista;
         atoi<- new A2I;

         out_string("Selecciona una opcion para agregarlo a la pila: \n \t ->Entero \n \t ->'+' suma \n \t ->'s' intercambia los 2 ultimos \n \t ->'e' para evaluar la pila \n \t ->'d' para mostrar la pila \n \t ->'x' para parar el programa \n");
         
         while (not opcion="x") loop
           {
              out_string(">");
              opcion<-in_string();
              num<-atoi.a2i(opcion);

               if (not num=0) then {
                              elementos<-elementos.cons(opcion);
                            }
                            else{
                               0;
                            }
               fi;

               if (opcion="s") then {
                              elementos<-elementos.cons(opcion);
                            }
                            else{
                               0;
                            }
               fi;

               if (opcion="+") then {
                              elementos<-elementos.cons(opcion);
                            }
                            else{
                               0;
                            }
               fi;

               if (opcion="d") then {
                              print_list(elementos);
                            }
                            else{
                               0;
                            }
               fi;

               if (opcion="e") then {
                              if (elementos.head()="s") then {
                                             elementos<-elementos.pop();
                                             elementos<-elementos.cambio();   
                                             }
                                             else{
                                                   0;
                                             }
                              fi;

                              if (elementos.head()="+") then {
                                             elementos<-elementos.pop();
                                             num<-atoi.a2i(elementos.head());
                                             elementos<-elementos.pop();
                                             num2<-atoi.a2i(elementos.head());
                                             elementos<-elementos.pop();
                                             elementos<-elementos.cons(atoi.i2a(num+num2));
                                             }
                                             else{
                                                   0;
                                             }
                              fi;

                            }
                            else{
                               0;
                            }
               fi;


           }
         pool;
         
         print_list(elementos);

      }
   };

};
