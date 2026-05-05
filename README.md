# gw-assess-public

Welcome — if you're interviewing with us for an engineering role, these are the code snippets we'll share during the code-review portion of the call. We'll put them on screen and ask you to review them out loud, like you would a teammate's PR.

A bit of context to make them readable:

- Multi-tenant SaaS for 9-1-1 calltakers, processing live emergency call audio.
- Tenants are isolated; every call belongs to exactly one tenant.
- Stack is Java / Spring / JPA on MySQL.

Feel free to read ahead. There's nothing to prepare or submit.

Files:

- [`NonEmergencyCallDao.java`](./NonEmergencyCallDao.java)
- [`CallController.java`](./CallController.java)
- [`migration.sql`](./migration.sql)
