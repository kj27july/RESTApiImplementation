package android.smartbattery.retrofit

class PostPojo {
    private var userId = 0f
    private var id = 0f
    private var title: String? = null
    private var body: String? = null

    // Getter Methods
    fun getUserId(): Float {
        return userId
    }

    fun getId(): Float {
        return id
    }

    fun getTitle(): String? {
        return title
    }

    fun getBody(): String? {
        return body
    }

    // Setter Methods
    fun setUserId(userId: Float) {
        this.userId = userId
    }

    fun setId(id: Float) {
        this.id = id
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun setBody(body: String?) {
        this.body = body
    }
}