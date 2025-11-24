# Sistema de Triage Básico

Sistema para clasificar pacientes según urgencia médica usando Java y Derby.

## Qué hace

Permite registrar pacientes en un puesto de salud y los clasifica automáticamente en:
- Rojo (Emergencia): dolor ≥8, frecuencia ≥120 o temperatura ≥39°C
- Amarillo (Prioritaria): dolor 5-7, frecuencia 100-119 o temperatura 37.5-38.9°C  
- Verde (Normal): otros casos

## Tecnologías usadas

- Java 17
- NetBeans
- Derby (base de datos)
- Swing (interfaz)
- Patrón DAO

## Estructura

- `src/modelo/` - Clases de datos
- `src/dao/` - Acceso a base de datos  
- `src/controlador/` - Lógica del sistema
- `src/vista/` - Interfaz gráfica
- `base_datos/` - Script SQL
- `documentos/` - Documentación de pruebas

## Funciones

- Guardar pacientes
- Ver lista en tabla
- Actualizar datos
- Eliminar registros
- Buscar por nombre
- Clasificación automática con colores

## Requisitos

- JDK 17+
- NetBeans
- 4 GB RAM

## Como ejecutar

1. Abrir NetBeans
2. File → Open Project
3. Seleccionar carpeta
4. Click en Run

## Base de datos

Usa Derby. El script está en `base_datos/script_triagedb.sql`
La BD se crea automáticamente al ejecutar.

## Uso

- Registrar: llenar formulario y guardar
- Buscar: escribir nombre
- Actualizar: seleccionar fila y modificar
- Eliminar: seleccionar y confirmar

## Validaciones

- Nombre: obligatorio
- Edad: 1-120
- Temperatura: 30-45°C
- Frecuencia: 1-250 lpm
- Dolor: 1-10

## Documentación

Carpeta `documentos/`:
- Plan de pruebas
- Casos de prueba  
- Registro de defectos
- Informe de calidad

## Autor

Luis Javier Garcia Arias  
Sistemas de Información en Salud - UNED  
Curso 03572 - 2025

Proyecto académico - No usar en entornos reales.
