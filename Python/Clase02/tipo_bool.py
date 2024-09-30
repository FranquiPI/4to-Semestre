
# Bool contiene los calores de True y False
# Los tipós numéricos, es false para el 0(cero), true para los demás valores
valor = 0
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = -1
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo String -> False '', True demás valores.
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo colecciones -> False para colecciones vacias
# Tipo colecciones -> True para todas las demás
#Lista
valor = []
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = [2, 3, 4]
resultado = bool(valor)
print(f'Valor de una lista de elementos: {valor}, Resultado: {resultado}')

#Tupla
valor = ()
resultado = bool(valor)
print(f'valor de una tupla vacía: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'valor de una tupla con elementos: {valor}, Resultado: {resultado}')

#EDiccionario
valor = {}
resultado = bool(valor)
print(f'valor de un diccionario vacío: {valor}, Resultado: {resultado}')

valor = {'Nombre': 'Juan', 'Apellido': 'Perez'}
resultado = bool(valor)
print(f'valor de un diccionario con elementos: {valor}, Resultado: {resultado}')

#Sentencias de control con bool
if '':
    print('Regresa verdadero')
else:
    print('Regresa Falso')

#Ciclos
Variable = 0
while Variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa Falso')