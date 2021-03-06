package org.dialang.common.model

import org.dialang.util.DialangLogger
import java.util.Date

class DialangSession extends Serializable with DialangLogger {

  var userId = ""
  var firstName = ""
  var lastName = ""
  var browserLocale = ""
  var browserReferrer = ""
  var consumerKey = ""
  var resourceLinkId = ""
  var resultUrl = ""
  var resourceLinkTitle = ""
  var sessionId = ""
  var ipAddress = ""
  var passId = ""
  var vsptSubmitted = false
  var saSubmitted = false
  var vsptSkipped = false
  var saSkipped = false
  var vsptZScore = 0F
  var vsptMearaScore = 0
  var vsptLevel = "V0"
  var saPPE = 0F
  var saLevel = ""
  var itemRawScore = 0
  var itemGrade = 0
  var itemLevel = ""
  var saResponses = Map[String, Int]()
  var bookletId = 0
  var bookletLength = 0
  var currentBasketNumber = 0
  var nextBasketId = 0
  var scoredItemList = List[ImmutableItem]()
  var scoredBasketList = List[Basket]()

  /* Test Execution Script */
  var tes = new TES

  private var _started = 0L
  def started_=(startedDate: Date) { _started = startedDate.getTime / 1000L }
  def started_=(startedTimestamp: Long) { _started = startedTimestamp }
  def started = _started

  /**
   * Resets all state except sessionId and adminLanguage
   */
  def clearPass() {

    debug("Resetting all state except the adminLanguage and sessionId ...")

    passId = ""
    tes.tl = ""
    tes.skill = ""
    vsptSubmitted = false
    saSubmitted = false
    vsptSkipped = false
    saSkipped = false
    vsptZScore = 0F
    vsptMearaScore = 0
    vsptLevel = "V0"
    saPPE = 0F
    saLevel = ""
    itemRawScore = 0
    itemGrade = 0
    itemLevel = ""
    saResponses = Map[String, Int]()
    bookletId = 0
    bookletLength = 0
    currentBasketNumber = 0
    nextBasketId = 0
    scoredItemList = List[ImmutableItem]()
    scoredBasketList = List[Basket]()
  }

  def clearSession() {

    clearPass()
    browserLocale = ""
    browserReferrer = ""
    sessionId = ""
    resourceLinkId = ""
    resultUrl = ""
    resourceLinkTitle = ""
  }

  def toCase(): DialangSessionCase = {

    DialangSessionCase(sessionId, passId, tes.al, tes.tl, tes.skill, vsptSubmitted, vsptSkipped, saSubmitted
                          , saSkipped, vsptZScore, vsptMearaScore, vsptLevel, saPPE, saLevel, bookletLength
                          , nextBasketId, scoredBasketList, scoredItemList, resultUrl)
  }
}
