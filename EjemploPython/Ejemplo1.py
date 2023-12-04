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


# Ejemplo de uso:
mi_vehiculo = Vehiculo("Mazda bt50", "Rojo", 2023)
mi_empresa = Empresa("ABACAR", "quito")

print(mi_vehiculo.obtener_informacion())
print(mi_empresa.obtener_informacion())
