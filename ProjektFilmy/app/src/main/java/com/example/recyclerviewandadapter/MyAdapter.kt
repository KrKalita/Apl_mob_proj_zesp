package com.example.recyclerviewandadapter

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewandadapter.databinding.FilmsRowBinding


class MyAdapter:RecyclerView.Adapter<MyViewHolder>(){//robimy klase dziedziczaca po RecyclerView ktory bedzie adapterem/adapter ma klase myviewHolder


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {//musi zwrocic klase MyViewHolder//tworzenie widoku holdera
        Log.d(TAG,"onCreateViewHolder")
        return MyViewHolder(FilmsRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))//LayoutInflater-tworzy obiekt kotlin z xmla//tu jest konwertowanie z xml na obiekty kotlin
    }
    var TAG:String="TAG"
    override fun getItemCount(): Int {//ile layoutow (button itd.) ma stworzyc, czyli ile takich rekordow w tej liscie
        Log.d(TAG,FilmsDataBase.titleList.size.toString())
        return FilmsDataBase.titleList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.binding.
        val name=holder.binding.titleFilm//holder: MyViewHolder, a ta klasa wyciaga xml i konwertuje go na obiekty kotlin
        val number=holder.binding.links
        Log.d(TAG,"cos:"+position.toString())
        name.setText(FilmsDataBase.titleList[position])//FilmsDataBase-odniesienie sie do klasy statycznej i wyciaganiecie z niej tablicy
//       position to index z tej listy//position sie inkrementuje az do wartosci zwracanej z getItemCount
        number.setText(FilmsDataBase.links[position])

        holder.binding.opis.setOnClickListener{
//            var adress=holder.binding.contactNumber.text.toString()//!!!!!!!!!!!!!!!!
            var adress="https://www.filmweb.pl/film/Incepcja-2010-500891"

            //link dac potem w aktywnosci
            var channelRevolShen=
                Intent(Intent.ACTION_VIEW, Uri.parse(adress))//action to wyswietla nam, parsowanie do uri!!!!!!!!!!!!!!
//            cos()
//            startActivity(channelRevolShen)//!!!!!!!!!!!!
//            var nowaAktywnosc: Intent = Intent(applicationContext,MainActivity2::class.java)
//            nowaAktywnosc.putExtra("idToken",idToken)
//            applicationContext.startActivity(nowaAktywnosc)//jak odpalić aktywnosc w adapterze?????
        }
    }


}
class MyViewHolder(val binding: FilmsRowBinding):RecyclerView.ViewHolder(binding.root)//na poczatku musimy wrzucic jaki widok ma byc, wiec bierzemy xmla contact_row i konwertujemy go na obiekty kotlin
//root to najwyzszy komponent z xmla
//klasa MyViewHolder dzidziczy po RecyclerView(widok rozwijanej listy)