class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "N", Toast.LENGTH_SHORT).show()
        actionBouton()
        Toast.makeText(this, "L", Toast.LENGTH_SHORT).show()
    }

    private fun actionBouton() {
        Toast.makeText(this, "O", Toast.LENGTH_SHORT).show()
        
        binding.bouton.setOnClickListener {
            Toast.makeText(this, "H", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "O", Toast.LENGTH_SHORT).show()
        }
        Toast.makeText(this, "Ë", Toast.LENGTH_SHORT).show()
    }
}


| ligne exécutée | effet                             | Stack |
|-----------------|-----------------------------------| -------------------- |
| private lateinit var binding: ActivityMainBinding       | creer une variable binding du type ActivityMainBinding qui sera initialiser plus tard                             |  Start |
| super.onCreate(savedInstanceState)       | excécute la méthode onCreate de la classe AppCompatibility de base avant d'être remplacer par les lignes qui suivent celui-ci                     | onCreate |
| binding = ActivityMainBinding.inflate(layoutInflater) | créer un objet de liaison entre la mise en page de la vue et les objets de la vue | onCreate |
| setContentView(binding.root) | affiche les objets de l'objet de liaison sur l'écran  | onCreate |
| Toast.makeText(this, "N", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre N  | onCreate |
| actionBouton() | appelle la fonction actionBouton() | onCreate |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O  | onCreate <br> **actionBouton** |
| binding.bouton.setOnClickListener {} | créer un évènement qui exécutera du code lorsque bouton est appuyé dessus  | onCreate <br> **actionBouton** |
| Toast.makeText(this, "Ë", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre Ë  | onCreate |
| Toast.makeText(this, "L", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre N  | onCreate |
| Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre h | OnClick |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O | OnClick |
| Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre h | OnClick |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O | OnClick |
| Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre h | OnClick |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O | OnClick |
