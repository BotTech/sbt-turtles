## Contributing

All contributions are welcome.

Take a look at the [Main Board] and see if there is anything in the `To do` column which you would like to work on.
The highest priority issues are at the top.

You may also look for any issues that are labeled with [help wanted].

Just because an issue does not have the [help wanted] label does not mean that help is not appreciated but just be aware
that we may already have plans to work on it.

Add a comment to the ticket to say that you are working on the issue and we will assign it to you and update the
relevant boards.

### Verified Commits

Make sure that you sign all your commits. See [Github - Signing Commits] for more details.

### Testing

#### Unit Tests

Run `test` for regular unit tests.

#### Plugin Tests

Run `scripted` for scripted plugin tests.

### Versioning

Version numbers are determined automatically using [dwijnand/sbt-dynver].

To create a new version add a new git annotated tag:
```bash
git tag -as v1.1.0
```

NOTE: The tag must be annotated (`-a`) and signed (`-s`).

### Continuous Integration

Continuous integration builds are done with [Travis CI].

### Publishing

The Travis CI build will automatically publish to [Bintray] and [GitHub] for all tagged commits on master.

#### Signed Artifacts

The artifacts are signed with key belonging to [BotTech]. Reach out to us if there are any issues with this.

#### Bintray

This uses [sbt/sbt-bintray] to publish artifacts to Bintray and [ohnosequences/sbt-github-release] to publish to GitHub.

## Refreshing From Giter8 Template

If the [BotTech/sbt-autoplugin.g8] Giter8 template has been updated you can incorporate those new
changes by doing:

```shell script
# Do not run the command if the working directory is not clean to avoid loosing any work.
[ -z "$(git status --porcelain)" ] && g8 -f -o . \
  '--pluginName=Turtles' \
  '--name=sbt-turtles' \
  '--organizationName=BotTech' \
  '--organization=nz.co.bottech' \
  '--package=nz.co.bottech.sbt.turtles' \
  '--purpose=An sbt plugin for sharing settings between the meta-builds and the main build.' \
  BotTech/sbt-autoplugin.g8
```

[BotTech]: https://github.com/BotTech
[Bintray]: https://bintray.com
[bottech/sbt-autoplugin.g8]: https://github.com/BotTech/sbt-autoplugin.g8
[dwijnand/sbt-dynver]: https://github.com/dwijnand/sbt-dynver
[GitHub]: https://github.com
[GitHub - Signing Commits]: https://help.github.com/articles/signing-commits/
[help wanted]: https://github.com/BotTech/sbt-turtles"/issues?q=is%3Aissue+is%3Aopen+label%3A%22help+wanted%22
[Main Board]: https://github.com/BotTech/sbt-turtles"/projects/1
[ohnosequences/sbt-github-release]: https://github.com/ohnosequences/sbt-github-release
[sbt/sbt-bintray]: https://github.com/sbt/sbt-bintray
[Testing sbt Plugins]: http://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html
[Travis CI]: https://travis-ci.org
