mongo admin

use easy-ticket

db.createUser(
  {
    user: "easyadmin",
    pwd: "dev1234",
    roles: [ { role: "dbOwner", db: "easy-ticket" } ]
  }
)

exit

