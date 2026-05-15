# gw-assess-public

These are the code snippets we'll share during the technical interview for engineering roles at GovWorx. The rest of this README explains where that call sits in our process, what to expect, and how to prepare.

If you got here from somewhere else and aren't interviewing with us — feel free to read on, but the snippets are most useful if you're heading into the call.

## About the work

We build a multi-tenant SaaS for 9-1-1 calltakers, processing live emergency call audio. Tenants are isolated; every call belongs to exactly one tenant. The stack is Java / Spring / JPA on MySQL.

The work is real-time, the data is sensitive, and the cost of a correctness bug is higher than in most software. That shapes how we think about reviews and tests — and it's a big part of what this interview is trying to surface.

## Where this call sits

By the time you're reading this, you've likely had an initial call with someone from GovWorx. The next step is a single 60-minute technical conversation with two or three engineers from our team.

There is no take-home, no whiteboard, no algorithm puzzle, and no live coding — the whole technical loop is this one call.

## What the 60 minutes looks like

Roughly:

- **Intros and context (5 min).** We'll tell you about the team, the product, and what we're hiring for. Ask about the *code* freely as we go — save questions about the team and the role for the end.
- **Your background (10 min).** We'll pick one project from your experience and dig into it. Be ready to talk about real work in depth, not the most impressive line on your resume.
- **Code review (25 min).** We'll put the snippets in this repo on screen and ask you to review them out loud, the way you would a teammate's PR. Take your time. Think out loud.
- **Design and testing (15 min).** Same code, different angle. We'll talk about how you'd test it, where the seams are, and how it would hold up if requirements shifted.
- **Your questions (5 min).** Real ones. We'll answer honestly.

## What we're trying to learn

We're listening for how you think, not whether you produce a clever catch. Specifically:

- Do you ask about the system before assuming what the code does?
- When you spot a problem, do you trace it across the layers it touches, or stop at the first one?
- Can you separate "this is wrong" from "this is a smell" from "this is fine, just unusual"?
- Can you talk about testing in concrete tradeoffs rather than slogans like "test everything" or "100% coverage"?
- Can you say "I don't know" cleanly?

The candidates we hire tend to be the ones who slow down, ask, and reason — not the ones who race to a verdict.

## How to prepare

Don't over-prepare. The interview is structured to reward live thinking, and rehearsed answers tend to stand out in the wrong direction.

What helps:

- Read the three files in this repo. They're shaped like the code we'll review on the call — the on-screen version may differ in small ways, but the stack, conventions, and context are the same. You're looking at idiomatic Spring/JPA on MySQL; you don't need to memorize trivia, but you should be comfortable reading a Spring controller, a JPA `@Query` method, and a MySQL DDL fragment.
- Have a recent piece of your own work in mind that you can describe end-to-end — architecture, tradeoffs, what surprised you.
- Make sure your audio and video work and you can see a shared screen clearly.

What doesn't help: memorizing Java or Spring trivia, drafting a written review of the snippets, or rehearsing canned answers.

## After the call

We'll be in touch with a decision once we've debriefed and aligned. If you haven't heard from us within two weeks, email the person who scheduled your call and we'll give you a real update.

## Accommodations

If anything about the format would make it harder for you to do your best work — timing, format, screen-sharing, audio, anything else — tell us before the call and we'll adjust.

## Files

These are deliberately partial fragments — a controller slice, a repository method, a table sketch. Assume the rest compiles.

- [`NonEmergencyCallDao.java`](./NonEmergencyCallDao.java)
- [`CallController.java`](./CallController.java)
- [`migration.sql`](./migration.sql)
