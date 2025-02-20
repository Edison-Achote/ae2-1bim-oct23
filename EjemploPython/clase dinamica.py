class Vehiculo:
    def __init__(self, modelo, color, año):
        self.modelo = modelo
        self.color = color
        self.año = año

    def obtener_informacion(self):
        return f"Vehículo: {self.modelo}, Color: {self.color}, Año: {self.año}"


class Empresa:
    def __init__(self, nombre, direccion):
        self.nombre = nombre
        self.direccion = direccion

    def obtener_informacion(self):
        return f"Empresa: {self.nombre}, Dirección: {self.direccion}"


def crear_vehiculo(modelo, color, año):
    return Vehiculo(modelo, color, año)


def crear_empresa(nombre, direccion):
    return Empresa(nombre, direccion)


# Ejemplo de uso:
mi_vehiculo = crear_vehiculo("Toyota hilux", "Azul", 2022)
mi_empresa = crear_empresa("ABC Motors", "123 Calle Principal")

print(mi_vehiculo.obtener_informacion())
print(mi_empresa.obtener_informacion())
