# practicaEnEquipo

crear una biblioteca en equipo

colaboradores:

- c15c0-SL
- MatiasAaronSosaCFH
- Tanitodas
- javote94
- VictorDiaz1
- mikefink22
- tit02023
- miracodex


### Estructura de ramas del proyecto
- main
    - developer
        - developer-name1
        - developer-name2
        - developer-name3

### Creando ramas

`git status` (para ver donde estamos)

`git checkout main` (para pasarnos a main)

`git branch developer` 

`git checkout developer`

`git branch --set-upstream-to=origin/developer developer`

`git pull`

`git branch developer-name1` (cambiar por tu nombre)

`git checkout developer-name1`


### Protocolo Diario


#### PASO 1: Al comienzo del trabajo diario

|  | Comando     | Descripción                |
| :-------- | :------- | :------------------------- |
| **1** | `git status` | *Verifico en qué rama estoy y si hay cambios por agregar* |
| **2** | `git checkout main` | *Me cambio a rama main* |
| **3** | `git pull` | *Actualizo desde repositorio remoto* |
| **4** | `git status` | *siempre saber dónde estoy* |
| **5** | `git checkout developer` | *Me cambio a rama developer* |
| **6** | `git pull` | *Actualizo desde repositorio remoto* |
| **7** | `git status` | *es mi mejor aliado* |
| **8** | `git checkout mi-rama` | *Reemplazo mi-rama por el nombre de la rama individual* |
| **9** | `git merge developer` | *Propago los cambios desde developer local a rama individual.* |

#### PASO 2: Al subir los cambios

|  | Comando     | Descripción                |
| :-------- | :------- | :------------------------- |
| **1** | `git status` | *Verificar que esté en mi rama y cuáles son los archivos modificados a agregar al proyecto* |
| **2** | `git add -A` | *Para agregar todos los archivos de una vez* |
| **3** | `git commit -m ”...”` | *Entre comillas una descripción de los cambios efectuados en esta versión, Responder QUE Y PORQUE en menos de 70 caracteres* |
| **4** | **repetir PASO 1** | *verifico que no haya nuevas actualizaciones de ramas principales antes de subir mis cambios. Si las hay se deberá hacer nuevamente el paso 1 completo y los pasos 2.1, 2.2 y 2.3.* |
| **5** | `git push origin mi-rama` | *Subo los cambios al repositorio remoto.* |
| **6** | **GitHub: pull request** | *En mi GitHub solicito un PR a la rama*  **Developer**  |
