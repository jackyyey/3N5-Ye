## Client
| ligne exécutée | effet | pile d'appels |
|-----|-----|-----|
| super.onCreate(savedInstanceState) | exécute la méthode onCreate de classe parent | __OnCreate__ |
| binding = ActivityDetailsBinding.inflate(layoutInflater) | Créer des objects de liaisons avec le layout XML permettant d'accéder aux vues | __OnCreate__ |
| setContentView(binding.root) | Affiche le contenu sur l'écran | __OnCreate__ |
| var id = intent.getLongExtra("id", 0) | retourne une valeur avec la clé id du intent et assigne cette valeur au variable id, retourne 0 si id ne contient pas de valeur | __OnCreate__ |
| displayDetails(id) | Appelle la fonction displayDetails avec id comme paramètre | __OnCreate__ |
| val service: Service = RetrofitUtil.get() | instancie un objet permettant de faire des appelles http retrofit et de traiter les retours | __displayDetails__ <br> OnCreate |
| service.detail(id).enqueue(object : Callback<TaskDetailResponse> | Fait une appelle asynchrone au http://localhost:8080/api/detail/{id} | __displayDetails__ <br> OnCreate |

## Serveur
| ligne exécutée | effet | pile d'appels |
|-----|-----|-----|
| System.out.println("KICKB SERVER : Detail  with cookie "); | Retourne "KICKB SERVER : Detail with cookie" dans la console | __detail__ <br> Main |
| MUser user = currentUser(); // Décrire uniquement l'effet global de cette ligne | Instancie un nouveau utilisateur et assigne l'utilisateur au variable user | __detail__ <br> Main |
| return serviceTask.detail(id, user); | Retourne les détails d'une tâche spécifique pour d'un utilisateur | __detail__ <br> Main |

## Client
| ligne exécutée | effet | pile d'appels |
|-----|-----|-----|
| if (response.isSuccessful) | Vérifie que la réponse du serveur est 200 | __displayDetails__ <br> OnCreate |
| binding.tvTaskName.text = response.body()!!.name | Affiche le nom de la tâche |
