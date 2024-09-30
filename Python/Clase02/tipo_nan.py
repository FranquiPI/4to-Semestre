import math
from decimal import Decimal

# Nan (Not a number)
a = float('NaN')
print(f'a: {a}')

#Módulo math
a = float('nan')
print(f'Es de tipo NaN(Not a Number)?: {math.isnan(a)}')

#Módulo decimal
b = Decimal('Nan')
print(f'Es de tipo NaN(Not a number)?: {math.isnan(a)}')