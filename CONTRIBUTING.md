# Contributing to Web-APIs

 You can contribute to this project by raising issues and/or sending `git` pull
requests.

<br/>

## Report issues

 If you find any issue with the software or want to ask for an enhancement, use
the Github's [issue tracker](https://github.com/css4j/web-apis/issues).

<br/>

## Pull requests

 To contribute code to this project it is recommended to open an issue first,
explaining the rationale for the changes that you want to implement. Then, in
the title of the pull request (PR) you can include a reference like "fixes #NN"
where NN is the issue number. And it is generally a good idea to base your PR on
a branch that was named after the issue; for example your branch could be named
`issue-14`.

 A PR should only try to fix a single issue, unless it fixes two or more issues
that are very related or effectively the same. And if a commit has two or more
different purposes, it is often better to split it in multiple commits; tools
like the _Git GUI_ are particularly useful for that.

<br/>

### Commit messages

 It is recommended that commit messages (or at least the message for the main
commit) start with a prefix related to the API being affected. For example:
```
smil: change return type of function. Fixes #2.
```
If the commit has a wider scope than a single area, you do not need to include
any prefix, for example:
```
Add .gitattributes file.
```
 The commit should focus on a specific task, and its descriptive message should
tell accurately what the commit does. For example, do not mix bug fixes with
arbitrary clean-ups, unless the clean-up is part of the fix.

 Although it is acceptable to include a small, unrelated code formatting fix
inside a bug-fixing commit (like a small indentation fix in the same file), if
the commit contains several formatting changes they should be split to a
different commit. That eases the task of future code reviewers.

<br/>

### Code style

 The code style could be summarized by the following points:

- Indent by tabs, not spaces. The automated formatting provided by the Eclipse
IDE is often used.
- Avoid trailing whitespace except for empty lines in Javadoc comments.
- `if`-`else` blocks should always use curly braces, even if a single line of
code is involved.
- Long, descriptive variable names are preferred.
- Add comments to explain what the code is trying to do, but avoiding useless
prose that just mimics the code, like _"check if foo is larger than 1"_ as a
comment to `if (foo > 1)`.
- Public and protected methods must have documentation comments.
- Code readability should not be sacrificed for compactness, unless there are
obvious gains and the trade-off can be justified. For example, `i++; foo(i);` is
preferable to `foo(++i);` except in conditional expressions.
- Classes and methods should have the minimum visibility that they require.
A method should not have `protected` visibility when being package-visible could
be enough, unless subclasses in other packages would naturally extend it. For
complex package-level or inner classes, it is acceptable to have `protected`
methods as a mean to document which ones are intended to be overridden by other
classes. (In that case, protected methods do not appear in the Javadocs and
therefore are not part of the API)

<br/>

### Licensing

 All your contributions are submitted according to the license of this project,
see the LICENSE file for more information.

## Distribution

 This project [is not being submitted to the Maven Central repository](https://groups.google.com/g/css4j/c/op5jIoINb3M/m/IiiN-LfkDAAJ)
and this is something known to deter some contributors, thus being a relevant
information to cover here.

 However, the project distributes its artifacts through the css4j Maven
repository, as explained in the [README](README.md) (see 'Usage from a Gradle
project'). Please use that repository **only** for the artifact groups that it
supplies.
