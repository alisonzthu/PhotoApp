package com.example.macstudio.submissionappalison.viewModels

import android.arch.lifecycle.ViewModel
import javax.inject.Inject
import com.example.macstudio.submissionappalison.daos.ImagesDao;

class ImageListViewModel @Inject constructor(private val dataSource: ImagesDao): ViewModel() {
}