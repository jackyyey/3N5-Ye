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
| private lateinit var binding: ActivityMainBinding       | creer une variable binding du type ActivityMainBinding                             |  Start |
| override fun onCreate(savedInstanceState: Bundle?) {       | remplace le code de la méthode onCreate par les lignes qui suit                     | onCreate |
| binding = ActivityMainBinding.inflate(layoutInflater) | creer un objet de liaison entre la mise en page de la vue et les objets de la vue | onCreate |
| setContentView(binding.root) | affiche les objets de l'objet de liaison du XML d'ActivityMainBinding sur l'écran  | onCreate |
| Toast.makeText(this, "N", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre N  | onCreate |
| actionBouton() | appelle la fonction actionBouton() | onCreate |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O  | onCreate <br> **actionBouton** |
| binding.bouton.setOnClickListener {} | creer un évènement qui executera du code lorsque bouton est appuié dessus  | onCreate <br> **actionBouton** |
| Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre h | OnClick |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O | OnClick |
| Toast.makeText(this, "Ë", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre Ë  | onCreate |
| Toast.makeText(this, "L", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre N  | onCreate |
| Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre h | OnClick |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O | OnClick |
| Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre h | OnClick |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O | OnClick |
| Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre h | OnClick |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | affiche un popup avec la lettre O | OnClick |
