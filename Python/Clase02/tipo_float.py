# Profundizamos en el tipo float.
a = 3.0
print(f'a: {a:.2F}') #Colocando el punto y 2F nos va a mostrar 2 decimales atras del número -> 3.00

#Constructor de tipo float -> puede recibir int y str
a = float(10) # Le pasamos un tipo entero (int)
a = float('10') # Le pasamos un tipo string (str)
print(f'a: {a:.2F}')

#Notación exponencial (valores positivos o negativos)
a = 3e5 #con la letra 'e'(exponencial) y la cantidad del número, le estariamos pasando la cantidad de '0' que queremos que tenga el número
print(f'a: {a:.2f}') ##300000.00

a = 3e-5
print(f'a: {a:.5f}') #0.00003

#Cualquier calculo que incluye un float, todo cambia a float.

a = 4.0 + 5
print(a)
print(type(a)) #Con el 'type' nos muestra de que tipo es la variable.