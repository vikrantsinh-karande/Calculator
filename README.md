# Calculator
C:\Users\vikss\eclipse-workspace\Calculator>git init

C:\Users\vikss\eclipse-workspace\Calculator>git status
On branch master
Your branch is up to date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   src/main/java/Calculator/Calculator/Calculator.java
        modified:   target/classes/Calculator/Calculator/Calculator.class

no changes added to commit (use "git add" and/or "git commit -a")

C:\Users\vikss\eclipse-workspace\Calculator>git add .

C:\Users\vikss\eclipse-workspace\Calculator>git status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        modified:   src/main/java/Calculator/Calculator/Calculator.java
        modified:   target/classes/Calculator/Calculator/Calculator.class


C:\Users\vikss\eclipse-workspace\Calculator>git checkout -b methods
Switched to a new branch 'methods'
M       src/main/java/Calculator/Calculator/Calculator.java
M       target/classes/Calculator/Calculator/Calculator.class

C:\Users\vikss\eclipse-workspace\Calculator>git branch
  master
* methods

C:\Users\vikss\eclipse-workspace\Calculator>git commit -m "added methods"
[methods 8cbddc4] added methods
 2 files changed, 35 insertions(+), 11 deletions(-)

C:\Users\vikss\eclipse-workspace\Calculator>git branch
  master
* methods

C:\Users\vikss\eclipse-workspace\Calculator>git push origin methods
Enumerating objects: 24, done.
Counting objects: 100% (24/24), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (13/13), 1.97 KiB | 672.00 KiB/s, done.
Total 13 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
remote:
remote: Create a pull request for 'methods' on GitHub by visiting:
remote:      https://github.com/vikrantsinh-karande/Calculator/pull/new/methods
remote:
To github.com:vikrantsinh-karande/Calculator.git
 * [new branch]      methods -> methods

C:\Users\vikss\eclipse-workspace\Calculator>
