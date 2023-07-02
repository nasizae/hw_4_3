package com.example.hw_4_3.Continent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_4_3.Country.CountryFragment
import com.example.hw_4_3.Country.onItemClick
import com.example.hw_4_3.R
import com.example.hw_4_3.databinding.FragmentContinentBinding

class ContinentFragment : Fragment(),onItemClick {

    private lateinit var binding: FragmentContinentBinding
    private lateinit var continents :ArrayList<Continent>
    private lateinit var continentViewAdapter: ContinentViewAdapter
    private lateinit var bundle: Bundle
    private  var countryFragment:CountryFragment=CountryFragment()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentContinentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        continentViewAdapter = ContinentViewAdapter(continents,this)
        binding.rvContinent.adapter=continentViewAdapter



    }


    private fun loadData() {
        continents=ArrayList()
        continents.apply {
           add(Continent("Евразия","https://pictures.pibig.info/uploads/posts/2023-04/1680368091_pictures-pibig-info-p-yevraziya-risunok-instagram-3.jpg"))
           add(Continent("Северная Америка","https://www.what-who.com/uploads/images/s/s_015.jpg"))
           add(Continent("Южная Америка","https://sp-ao.shortpixel.ai/client/to_auto,q_glossy,ret_img,w_700,h_894/https://shkolnaiapora.ru/wp-content/uploads/2018/04/%D0%AE%D0%B6%D0%BD%D0%B0%D1%8F-%D0%90%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B0-1-700x894.jpg"))
           add(Continent("Африка","https://kartinkof.club/uploads/posts/2023-05/1683394884_kartinkof-club-p-afrika-materik-kartinki-7.jpg"))
           add(Continent("Австралия","https://mirplaneta.com/wp-content/uploads/2017/02/otdykh-v-avstralii.jpg"))

        }
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onClickItem(position: Int) {
       bundle=Bundle()
        bundle.putInt("pos",position)
        countryFragment.arguments=bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,countryFragment).addToBackStack(null).commit()
    }




}

