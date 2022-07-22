package com.example.palstagram.navigation.model

data class ContentDTO (var explain : String? = null, // 사진 설명
                       var imageUrl : String? = null, // 이미지 주소
                       var uid : String? = null, // 유저 정보
                       var userId : String? = null, // 유저 이미지
                       var timestamp : Long? = null, // 올린 시간
                       var favoriteCount : Int = 0, // 좋아요 개수
                       var favorites : MutableMap<String, Boolean> = HashMap()){ // 중복 좋아요 방지
    data class Comment(var uid : String? = null,
                       var userId : String? = null,
                       var comment : String? = null,
                       var timestamp : Long? = null)
}