# sprecsample

`launch.json`

````
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Debug",
            "request": "launch",
            "mainClass": "sprec.sprecsample.SprecsampleApplication",
        }
    ]
}
````

## Note

Nelle properties inserire `host.docker.internal` se stiamo runanndo il microservizio su un container, altrimenti `localhost` se lo stiamo eseguendo in debug, ad esempio.
Ciò è dato dal fatto che i due container non stanno sullo stesso localhost
