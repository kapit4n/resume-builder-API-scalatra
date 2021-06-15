# Resume Builder #

## Build & Run ##

```sh
$ cd Resume_Builder
$ sbt
> jetty:start
> browse
```

### current resources
- GET localhost:8080/resumes
- GET localhost:8080/db/create-tables
- GET localhost:8080/db/load-data
- GET localhost:8080/coffees

### next resources
- POST /resurces
- GET /resurces/1
- PUT /resurces/
- POST /resurces/1/education
- POST /resurces/1/experience
- POST /resurces/1/skills

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.
