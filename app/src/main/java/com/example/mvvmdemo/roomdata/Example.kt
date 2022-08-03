package com.example.mvvmdemo.roomdata

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


public class Example {

    @SerializedName("page_id")
    @Expose
    private var pageId: String? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("access_token")
    @Expose
    private var accessToken: String? = null

    @SerializedName("category")
    @Expose
    private var category: String? = null

    @SerializedName("about")
    @Expose
    private var about: String? = null

    @SerializedName("birthday")
    @Expose
    private var birthday: String? = null

    @SerializedName("business")
    @Expose
    private var business: String? = null

    @SerializedName("company_overview")
    @Expose
    private var companyOverview: String? = null

    @SerializedName("contact_address")
    @Expose
    private var contactAddress: String? = null

    @SerializedName("cover")
    @Expose
    private var cover: String? = null

    @SerializedName("current_location")
    @Expose
    private var currentLocation: String? = null

    @SerializedName("description")
    @Expose
    private var description: String? = null

    @SerializedName("emails")
    @Expose
    private var emails: String? = null

    @SerializedName("engagement")
    @Expose
    private var engagement: String? = null

    @SerializedName("fan_count")
    @Expose
    private var fanCount: String? = null

    @SerializedName("followers_count")
    @Expose
    private var followersCount: String? = null

    @SerializedName("founded")
    @Expose
    private var founded: String? = null

    @SerializedName("has_whatsapp_business_number")
    @Expose
    private var hasWhatsappBusinessNumber: String? = null

    @SerializedName("has_whatsapp_number")
    @Expose
    private var hasWhatsappNumber: String? = null

    @SerializedName("link")
    @Expose
    private var link: String? = null

    @SerializedName("location")
    @Expose
    private var location: String? = null

    @SerializedName("phone")
    @Expose
    private var phone: String? = null

    @SerializedName("rating_count")
    @Expose
    private var ratingCount: String? = null

    @SerializedName("username")
    @Expose
    private var username: String? = null

    @SerializedName("website")
    @Expose
    private var website: String? = null

    @SerializedName("picture")
    @Expose
    private var picture: String? = null

    fun getPageId(): String? {
        return pageId
    }

    fun setPageId(pageId: String?) {
        this.pageId = pageId
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getAccessToken(): String? {
        return accessToken
    }

    fun setAccessToken(accessToken: String?) {
        this.accessToken = accessToken
    }

    fun getCategory(): String? {
        return category
    }

    fun setCategory(category: String?) {
        this.category = category
    }

    fun getAbout(): String? {
        return about
    }

    fun setAbout(about: String?) {
        this.about = about
    }

    fun getBirthday(): String? {
        return birthday
    }

    fun setBirthday(birthday: String?) {
        this.birthday = birthday
    }

    fun getBusiness(): String? {
        return business
    }

    fun setBusiness(business: String?) {
        this.business = business
    }

    fun getCompanyOverview(): String? {
        return companyOverview
    }

    fun setCompanyOverview(companyOverview: String?) {
        this.companyOverview = companyOverview
    }

    fun getContactAddress(): String? {
        return contactAddress
    }

    fun setContactAddress(contactAddress: String?) {
        this.contactAddress = contactAddress
    }

    fun getCover(): String? {
        return cover
    }

    fun setCover(cover: String?) {
        this.cover = cover
    }

    fun getCurrentLocation(): String? {
        return currentLocation
    }

    fun setCurrentLocation(currentLocation: String?) {
        this.currentLocation = currentLocation
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }

    fun getEmails(): String? {
        return emails
    }

    fun setEmails(emails: String?) {
        this.emails = emails
    }

    fun getEngagement(): String? {
        return engagement
    }

    fun setEngagement(engagement: String?) {
        this.engagement = engagement
    }

    fun getFanCount(): String? {
        return fanCount
    }

    fun setFanCount(fanCount: String?) {
        this.fanCount = fanCount
    }

    fun getFollowersCount(): String? {
        return followersCount
    }

    fun setFollowersCount(followersCount: String?) {
        this.followersCount = followersCount
    }

    fun getFounded(): String? {
        return founded
    }

    fun setFounded(founded: String?) {
        this.founded = founded
    }

    fun getHasWhatsappBusinessNumber(): String? {
        return hasWhatsappBusinessNumber
    }

    fun setHasWhatsappBusinessNumber(hasWhatsappBusinessNumber: String?) {
        this.hasWhatsappBusinessNumber = hasWhatsappBusinessNumber
    }

    fun getHasWhatsappNumber(): String? {
        return hasWhatsappNumber
    }

    fun setHasWhatsappNumber(hasWhatsappNumber: String?) {
        this.hasWhatsappNumber = hasWhatsappNumber
    }

    fun getLink(): String? {
        return link
    }

    fun setLink(link: String?) {
        this.link = link
    }

    fun getLocation(): String? {
        return location
    }

    fun setLocation(location: String?) {
        this.location = location
    }

    fun getPhone(): String? {
        return phone
    }

    fun setPhone(phone: String?) {
        this.phone = phone
    }

    fun getRatingCount(): String? {
        return ratingCount
    }

    fun setRatingCount(ratingCount: String?) {
        this.ratingCount = ratingCount
    }

    fun getUsername(): String? {
        return username
    }

    fun setUsername(username: String?) {
        this.username = username
    }

    fun getWebsite(): String? {
        return website
    }

    fun setWebsite(website: String?) {
        this.website = website
    }

    fun getPicture(): String? {
        return picture
    }

    fun setPicture(picture: String?) {
        this.picture = picture
    }
}
