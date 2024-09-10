import math
from decimal import Decimal

# Manejo de valores infinitos. Solo funciona con el constructor float
infinito_positivo = float('inf') #Cadena del valor infinito es 'inf'
print(f'Infinito Positivo: {infinito_positivo}')
print(f'Es infinito?: {math.isinf(infinito_positivo)}')

infinito_negativo = float('-inf') #Cadena del valor infinito negativo es '-inf'
print(f'Infinito negativo: {infinito_negativo}')
print(f'Es infinito?: {math.isinf(infinito_negativo)}')

#Modulo math
infinito_positivo = math.inf
print(f'Infinito Positivo: {infinito_positivo}')
print(f'Es infinito?: {math.isinf(infinito_positivo)}')

infinito_negativo = -math.inf
print(f'Infinito negativo: {infinito_negativo}')
print(f'Es infinito?: {math.isinf(infinito_negativo)}')

#Modulo decimal
infinito_positivo = Decimal('Infinity')
print(f'Infinito Positivo: {infinito_positivo}')
print(f'Es infinito?: {math.isinf(infinito_positivo)}')

infinito_negativo = Decimal('-Infinity')
print(f'Infinito negativo: {infinito_negativo}')
print(f'Es infinito?: {math.isinf(infinito_negativo)}')