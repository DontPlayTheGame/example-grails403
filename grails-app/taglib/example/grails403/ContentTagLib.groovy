package example.grails403

class ContentTagLib {
    static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [rawOutput: [taglib:'raw']]
    static namespace = "myapp"

    def rawOutput = {attrs ->
        String html = attrs['html']
        out << html
    }
}