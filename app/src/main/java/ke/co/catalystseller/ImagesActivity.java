//package ke.co.catalystseller;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//import android.widget.Toast;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ImagesActivity extends AppCompatActivity {
//    private RecyclerView mRecyclerView;
//    private ImageAdapter imageAdapter;
//
//    private DatabaseReference mDatabaseRef;
//    private List<Uploads> mUploads;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_images);
//
//        mRecyclerView = findViewById(R.id.recycler_view);
//        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        mUploads = new ArrayList<>();
//
//        mDatabaseRef = FirebaseDatabase.getInstance().getReference("Uploads");
//
//        mDatabaseRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()){
//                    Uploads upload = postSnapshot.getValue(Uploads.class);
//                    mUploads.add(upload);
//                }
//
//                imageAdapter = new ImageAdapter(ImagesActivity.this, mUploads);
//                mRecyclerView.setAdapter(imageAdapter);
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(ImagesActivity.this,databaseError.getMessage(),Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//    }
//}
