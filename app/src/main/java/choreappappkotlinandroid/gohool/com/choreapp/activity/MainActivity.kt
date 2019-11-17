package choreappappkotlinandroid.gohool.com.choreapp.activity



import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import choreappappkotlinandroid.gohool.com.choreapp.R
import choreappappkotlinandroid.gohool.com.choreapp.data.ChoresDatabaseHandler
import choreappappkotlinandroid.gohool.com.choreapp.model.Chore


class MainActivity : AppCompatActivity() {

    var dbHandler: ChoresDatabaseHandler? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHandler = ChoresDatabaseHandler(this)

        var chore = Chore()
        chore.choreName = "Clean room"
        chore.assignedBy = "carlos"
        chore.assignedTo = "kalli"

        //dbHandler!!.createChore(chore)

        //Read from DB

        var chores: Chore = dbHandler!!.readChore(2)
        Log.d("Item:", chore.choreName)











    }
//        progressDialog = ProgressDialog(this)
//        dbHandler = ChoresDatabaseHandler(this)
//
//
//        checkDB()
//
//
//        saveChore.setOnClickListener {
//            progressDialog!!.setMessage("Saving...")
//            progressDialog!!.show()
//
//
//             if (!TextUtils.isEmpty(enterChoreId.text.toString())
//                     && !TextUtils.isEmpty(assignToId.text.toString())
//                     &&  !TextUtils.isEmpty(assignedById.text.toString())) {
//                 //save to database
//                 var chore = Chore()
//                 chore.choreName = enterChoreId.text.toString()
//                 chore.assignedTo = assignToId.text.toString()
//                 chore.assignedBy = assignedById.text.toString()
//
//                 saveToDB(chore)
//                progressDialog!!.cancel()
//
//                 startActivity(Intent(this, ChoreListActivity::class.java))
//
//
//             } else {
//                 Toast.makeText(this, "Please enter a chore", Toast.LENGTH_LONG).show()
//             }
//        }
//
//    }
//
//
//    fun checkDB() {
//        if (dbHandler!!.getChoresCount() > 0) {
//           startActivity(Intent(this, ChoreListActivity::class.java))
//
//        }
//    }
//    fun saveToDB(chore: Chore) {
//        dbHandler!!.createChore(chore)
//    }
}