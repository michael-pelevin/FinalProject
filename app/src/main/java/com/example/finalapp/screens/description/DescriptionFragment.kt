package com.example.finalapp.screens.description

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.finalapp.R

class DescriptionFragment : Fragment() {

    lateinit var viewModel: DescriptionModelView

    companion object {

        private const val DESCRIPTION = "Description"

        fun newInstance(message: String): Fragment =
            DescriptionFragment().apply {
                var bundle = Bundle()
                bundle.putString(DESCRIPTION, message)
                arguments = bundle
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[DescriptionModelView::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.description_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val descriptionView = view.findViewById<TextView>(R.id.description)
        val descr = arguments?.getString(DESCRIPTION)
        if (descr != null) {
            viewModel.setDescription(descr)
        }
        viewModel.getDescription.observe(viewLifecycleOwner) {
            descriptionView.text = it.toString()
        }
    }
}
