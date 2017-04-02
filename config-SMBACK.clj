; Configuration setting for GHI -> JIRA CSV Export

{
 ; Github login:
 :auth "philrz@yahoo.com:xxxxx"

 ; Project owner and name:
 :ghuser "draios"

 ; Github may requires this in all lower case, even if your project name is mixed case.
 :ghproject "backend"

 ; Maximum number of comments per issue
 :maxcmt 500

 ; JIRA project setting - will be used to convert #123 to ABC-123
 ; so that source control integration still works.
 :jira-project "SMBACK"

 ; The issue offset is used when you need to import to an existing JIRA project,
 ; it is added to the Github issue number. Use 0 if you are starting with an
 ; empty JIRA project.
 :issue-offset 0

 ; Git base URL - used to translate GHI "referenced" events to
 ; comments with a URL pointing to the link.
 :git-base-url "https://github.com/draios/backend/commit/"

 ; Translate user names from
 :user-map
 { "KnoxAnderson" "knox"
  "bertocci" "brett"
  "hareshb" "haresh"
  "sbilello" "sergio"
  "gianlucaborello" "gianluca"
  "payalc5" "payal"
  "03cranec" "chris"
  "andredami" "andrea.damiani"
  "apurvadave" "apurva"
  "ldegio" "loris"
  "alexsysdig" "alex.diaz"
  "ceizner" "ceizner"
  "aleks-f" "alex"
  "raspo" "tommaso"
  "madchicken" "pierpaolo"
  "CloudTFox" "fox"
  "alexgallotta" "alessandro"
  "karastojko" "tomislav"
  "adityakinifr" "kini"
  "lessenadam" "adam"
  "mlewald" "martin"
  "alexislucio" "alexis"
  "smartinovic" "stefan"
  "luca3m" "luca"
  "pericamilosevic" "perica"
  "crohn" "davide.monaco"
  "anegrin" "alessandro.negrin"
  "vedraan" "vedran"
  "danpopSD" "dan.papandrea"
  "whisp8" "reed"
  "philrz" "admin"
  "bencer" "jorge"
  "davideschiera" "davide"
  "ret2libc" "riccardo"
  "AndreaScn" "andrea"
  "elias94" "elia"
  "hyperboreans" "claudio"
  "mstemm" "mark.stemm"
  "ltagliamonte" "luigi"
  "scyth" "zeljko"
  "etung1" "eddie"
  "thom-sd" "thom"
  "tjskrish" "Thejas"
  "maerten" "maarten" }
}
